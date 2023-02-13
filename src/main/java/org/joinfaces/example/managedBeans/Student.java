package org.joinfaces.example.managedBeans;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("Student")
public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private String language;
    private List<String> favoriteLanguages;
    //list of countries for the drop-down list;
    List<String> countryOptions;
    List<String> languageList;

    public Student(){
        countryOptions = new ArrayList<>();
        countryOptions.add("Ghana");
        countryOptions.add("Brazil");
        countryOptions.add("France");
         countryOptions.add("Germany");
        countryOptions.add("India");
        countryOptions.add("Turkey");
        countryOptions.add("United Kingdom");
        countryOptions.add("UnitedState") ;
        //adding list of favorite program
        languageList = new ArrayList<>();
        languageList.add("Java");
        languageList.add("C#");
        languageList.add("PHP");
        languageList.add("Ruby");

    }

    public List<String> getCountryOptions() {
        return countryOptions;
    }

    public void setFavoriteLanguages(List<String> favoriteLanguages) {
        this.favoriteLanguages = favoriteLanguages;
    }

    public List<String> getFavoriteLanguages() {
        return favoriteLanguages;
    }

    public List<String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<String> languageList) {
        this.languageList = languageList;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
