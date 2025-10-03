package com.pluralsight;

public class CellPhone {
    String model;
    String phoneNumber;
    String carrier;
    int serialNumber;
    String owner;

   public CellPhone() {
       this.model = "";
       this.phoneNumber = "";
       this.carrier = "";
       this.serialNumber = 0;
       this.owner = "";
   }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
       this.model = model;
   }
    // public String phoneNumber
}


