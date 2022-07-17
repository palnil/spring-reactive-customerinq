package com.yoshallc.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInqResponse {

    private String firstName;
    private String lastName;
    private int age;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
