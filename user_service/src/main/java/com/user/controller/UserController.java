package com.user.controller;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.servie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

   // @Autowired
    // private RestTemplate restTemplate;

    @Autowired
    RestTemplate restTemplate = null;

    @GetMapping("/{userId}")
    @LoadBalanced
    public User getUser(@PathVariable("userId") Long userId){

        User user = this.userService.getUser(userId);

        List<Contact> contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+userId, List.class);
        user.setContacts(contacts);
        return user;
        // return this.userService.getUser(userId);
    }

/*

    public UserController(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        this.restTemplate.setMessageConverters(messageConverters);
    }*/

}
