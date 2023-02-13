package org.joinfaces.example.managedBeans;

import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import org.joinfaces.example.models.User;
import org.joinfaces.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("User")
public class UserBean {

    @Autowired
    UserService userService;
    private Long id;
    private String userName;
    private String password;

    public UserBean() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // validate login
    public String validateUsernamePassword() {
        Optional<User> user = userService.loginAsAdmin(this.getUserName(),
                this.getPassword());
        if(user.isPresent()){
            return "dashboard";
        }else{
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
        }
        return "invalid";
    }
}
