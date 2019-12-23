package com.designpatterns.behavioral.template;

public class AppUser extends SavingRecord {

    private String userName;

    private String pasword;







    @Override
    boolean validate() {

        if(pasword.length()<3){

            return false;
        }
        else {
            return true;
        }
    }



    @Override
    void beforeSave() {

        System.out.println("Saving Application User " + userName);

    }

    @Override
    void afterSave() {

        System.out.println("Application User saved successfully");

    }

    @Override
    void error() {

        System.out.println("Application User missed important Data !");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
}
