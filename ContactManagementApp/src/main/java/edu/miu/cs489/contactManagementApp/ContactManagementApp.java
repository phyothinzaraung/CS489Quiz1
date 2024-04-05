package edu.miu.cs489.contactManagementApp;

import edu.miu.cs489.contactManagementApp.model.Contact;
import edu.miu.cs489.contactManagementApp.model.EmailAddress;
import edu.miu.cs489.contactManagementApp.model.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ContactManagementApp {

    private static void printJSONFormat(List<Contact> contacts){
        System.out.println("Contacts in JSON format:");
        System.out.println("[");
        for(Contact contact: contacts){
            System.out.print("{\n\"firstName\":"+contact.getFirstName() + ",\n\"lastName\":"+contact.getLastName()
            +",\n\"company\":"+contact.getCompany()+",\n\"jobTitle\":"+contact.getJobTitle());
            List<PhoneNumber> phoneNumbers = contact.getPhoneNumbers();
            System.out.print(",\n\"phoneNumbers\":[");
            for (PhoneNumber phoneNumber: phoneNumbers) {
                if (phoneNumber != null) {
                    System.out.print("{\"label\":"+phoneNumber.getLabel() +
                            ",\"phoneNumber\":"+phoneNumber.getPhoneNumber());
                    System.out.print("},");
                }

            }
            System.out.print("],\n");
            List<EmailAddress> emailAddresses = contact.getEmailAddresses();
            System.out.print(",\"emailAddresses\":[{");
            for (EmailAddress emailAddress: emailAddresses) {
                if (emailAddress != null) {
                    System.out.print("{\"label\":"+emailAddress.getLabel() +
                            ",\"emailAddress\":"+emailAddress.getEmail());
                    System.out.print("},");
                }

            }
            System.out.print("]");
            System.out.print("},");
        }
        System.out.println("]");

    }

    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();
        List<PhoneNumber> phoneNumbers1 = new ArrayList<>();
        List<EmailAddress> emailAddresses1 = new ArrayList<>();

        phoneNumbers1.add(new PhoneNumber("Home", "240-133-0011"));
        phoneNumbers1.add(new PhoneNumber("Mobile", "240-112-0123"));
        emailAddresses1.add(new EmailAddress("Home", "dave.sang@gmail.com"));
        emailAddresses1.add(new EmailAddress("Work", "dsanger@argos.com"));
        contacts.add(new Contact("David", "Sanger", "Argos LLC", "Sales Manager",
                phoneNumbers1, emailAddresses1));

        contacts.add(new Contact("Carlos", "Jimenez", "Zappos", "Director", new ArrayList<>(), new ArrayList<>()));

        List<PhoneNumber> phoneNumbers2 = new ArrayList<>();
        List<EmailAddress> emailAddresses2 = new ArrayList<>();
        phoneNumbers2.add(new PhoneNumber("Work", "412-116-9988"));
        emailAddresses2.add(new EmailAddress("Work", "ali@bmi.com"));
        contacts.add(new Contact("Ali", "Gafar", "BMI Services", "HR Manager", phoneNumbers2, emailAddresses2));

        Collections.sort(contacts, new Comparator<Contact>() {

            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.getLastName().compareTo(c2.getLastName());
            }
        });
        printJSONFormat(contacts);
    }
}
