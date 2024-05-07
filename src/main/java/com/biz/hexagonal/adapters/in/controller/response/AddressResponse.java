package com.biz.hexagonal.adapters.in.controller.response;


import lombok.Data;

@Data
class AddressResponse {

    private String street;

    private String city;

    private String state;
}