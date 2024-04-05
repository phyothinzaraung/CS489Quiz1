package edu.miu.cs489.contactManagementApp.model;

public class EmailAddress {
    private String label;
    private String email;

    public EmailAddress(String label, String email) {
        this.label = label;
        this.email = email;
    }

    public EmailAddress() {
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
