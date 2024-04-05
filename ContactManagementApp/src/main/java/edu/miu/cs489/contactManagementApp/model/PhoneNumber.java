package edu.miu.cs489.contactManagementApp.model;

public class PhoneNumber {
    private String label;
    private String phoneNumber;

    public PhoneNumber(String label, String phoneNumber) {
        this.label = label;
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "label='" + label + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
