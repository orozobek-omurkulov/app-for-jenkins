package com.practice.UI.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor


public class User {
    private  String firstName;
    private  String lastName;
    private  String address;
    private  String city;
    private  String state;
    private  String zipCode ;
    private  String phoneNumber ;
    private  String ssn;
    private  String userName;
    private  String password;
    private  String confirmPassword;
}
