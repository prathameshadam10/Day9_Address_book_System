package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {

    ArrayList <Contacts> contactsDetails = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addDetails(){
        Contacts Details = new Contacts();
        System.out.println("Enter your First Name");
        Details.setFirstName(sc.nextLine());


        System.out.println("Enter your Last Name");
        Details.setLastName(sc.nextLine());


        System.out.println("Enter Your Address");
        Details.setAddress(sc.nextLine());


        System.out.println("Enter your City");
        Details.setCity(sc.nextLine());


        System.out.println("Enter your state");
        Details.setState(sc.nextLine());


        System.out.println("Enter your Zip code");
        Details.setZip(sc.nextLine());


        System.out.println("Enter your Contact Number");
        Details.setContactNum(sc.nextLine());


        System.out.println("Enter your Email ID");
        Details.setEmail(sc.nextLine());


        contactsDetails.add(Details);
    }
    public void displayContacts(){
        System.out.println(contactsDetails);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Address book system project !!!!=");

        AddressBookSystem person1 = new AddressBookSystem();
        person1.addDetails();
        person1.displayContacts();



    }
}

