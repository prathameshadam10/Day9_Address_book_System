package com.bridgelabz;

public class AddressBookSystem {

    public static void main(String[] args) {
        System.out.println("Welcome to the Address book system project !!!!=");
        Contacts cont = new Contacts();
        cont.setFirstName("Prathamesh");
        System.out.println(cont.getFirstName());
        cont.setLastName("Adam");
        System.out.println(cont.getLastName());
        cont.setAddress("Kuchan Nagar");
        System.out.println(cont.getAddress());
        cont.setCity("Solapur");
        System.out.println(cont.getCity());
        cont.setState("Maharastra");
        System.out.println(cont.getState());
        cont.setZip("413005");
        System.out.println(cont.getZip());
        cont.setContactNum("8983930906");
        System.out.println(cont.getContactNum());
        cont.setEmail("prathameshadam10@gmail.com");
        System.out.println(cont.getEmail());


    }
}
