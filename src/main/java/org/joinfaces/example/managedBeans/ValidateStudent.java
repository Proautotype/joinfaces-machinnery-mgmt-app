package org.joinfaces.example.managedBeans;

import jakarta.annotation.Nonnull;
import org.springframework.stereotype.Component;

@Component("validate_student")
public class ValidateStudent {
    @Nonnull()
    private String firstName,lastName,email;

    public ValidateStudent() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
