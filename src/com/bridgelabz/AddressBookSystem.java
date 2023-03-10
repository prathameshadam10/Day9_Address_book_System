package com.bridgelabz;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void edit(){
//        edit personal Details
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of person");
        int sr = sc.nextInt();
        System.out.println("For Update: ");
        System.out.println("a)First Name \n b)Last Name \n c)Mobile Number \n d)Address \n e)City \n f) State \n g)Zip \n h)EmailID");
        char update = sc.next().charAt(0);
        switch(update){
            case 'a' : {
                String updated = sc.nextLine();
                String FirstName = updated;
                System.out.println("First Name Updated...");
                break;

            }
            case 'b' : {
                String updated = sc.nextLine();
                String LastName = updated;
                System.out.println("Last name updated...");
                break;
            }
            case 'c' : {
                String updated = sc.nextLine();
                String MobileNumber = updated;
                System.out.println("Address updates...");
                break;

            }
            case 'd' : {
                String updated = sc.nextLine();
                String Address = updated;
                System.out.println("Address updated...");
                break;
            }
            case 'e' : {
                String updated = sc.nextLine();
                String City = updated;
                System.out.println("City Updated...");
                break;
            }
            case 'f' : {
                String updated = sc.nextLine();
                String State = updated;
                System.out.println("State updated...");
                break;
            }
            case 'g' : {
                String updated = sc.nextLine();
                String Zip = updated;
                System.out.println("Zip updated...");
                break;
            }
            case 'h' : {
                String updated = sc.nextLine();
                String EmailID = updated;
                System.out.println("EmailID updated...");
                break;
            }
            default:{
                System.out.println("No Changes");
            }
        }
    }
//    method that delete a user resource
    public void deleteContact(){
        Iterator<Contacts> contactDt = contactsDetails.iterator();
        while (contactDt.hasNext()){
            Contacts contacts = contactDt.next();
            contactDt.remove();
        }
        System.out.println("contacts removed");
        displayContacts();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Address book system project !!!!=");

        AddressBookSystem person1 = new AddressBookSystem();
        person1.addDetails();
        person1.displayContacts();
        person1.edit();
        AddressBookSystem person2 = new AddressBookSystem();
        person2.addDetails();
        person2.displayContacts();
        person2.edit();
        person2.deleteContact();

    }
}


