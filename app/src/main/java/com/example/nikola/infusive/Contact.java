package com.example.nikola.infusive;

import java.util.ArrayList;

/**
 * Created by Nikola on 3/28/2017.
 */

public class Contact {

    private String name;


    public Contact(String name) {

        this.name = name;


    }

    public String getName() {
        return name;
    }


    private static int lastContact = 0;

    public static ArrayList<Contact> createContactsList(int numContacts) {

        ArrayList<Contact> contacts = new ArrayList<Contact>();

        for (int i = 0; i < numContacts; i++) {

            contacts.add(new Contact("Person " + ++lastContact));

        }

        return contacts;
    }

}
