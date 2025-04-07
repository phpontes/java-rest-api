package com.ltp.contacts.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltp.contacts.pojo.Contact;

@Repository
public class ContactRepository {
    
    private List<Contact> contacts = Arrays.asList(
        new Contact("123", "Giuseppe das Couves", "5550123"),
        new Contact("456", "Yosef dos Repolhos", "5551234"),
        new Contact("789", "José das Alfaces", "5550000")
    );

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return contacts.get(index);
    }

    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

    public void updateContact(int index, Contact contact) { 
        contacts.set(index, contact); 
    }
    
    public void deleteContact(int index) {
        contacts.remove(index);
    }

}
