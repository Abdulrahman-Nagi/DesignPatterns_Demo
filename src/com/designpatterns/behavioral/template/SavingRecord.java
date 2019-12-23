package com.designpatterns.behavioral.template;

public abstract class SavingRecord {

   public void saveRecord() {

       if (validate())

       {
           beforeSave();
           afterSave(); }

       else {

           error();

       }

        }


   abstract boolean  validate();

    abstract void beforeSave();

    abstract void afterSave();

    abstract void error();



}
