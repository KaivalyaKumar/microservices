package com.contact.contact_service.service;

import com.contact.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ContactServiceImpl implements ContactService{
    //fake contact list

    List<Contact> list = List.of(
            new Contact(1L, "yashi@email.com", "Yashi",1311L),
            new Contact(2L, "yashi2@email.com", "Yashi2",1312L),
            new Contact(3L, "yashi3@email.com", "Yashi3",1313L),
            new Contact(4L, "yashi4@email.com", "Yashi4",1314L)
    );
    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
