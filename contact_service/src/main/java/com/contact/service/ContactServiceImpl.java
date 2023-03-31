package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    public List<Contact> contacts = new ArrayList<>();

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        contacts.add(new Contact(1L,"raoof@raoof.com","raoof",1311L));
        return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());

    }
}
