package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface ContactService {
    public  List<Contact> getContactsOfUser(Long userId);

}
