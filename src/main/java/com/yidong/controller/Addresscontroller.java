package com.yidong.controller;

import com.yidong.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.yidong.service.AddressService;

import java.util.List;

@Controller
public class Addresscontroller {


    @Autowired
    private AddressService addressService;


    private List<Address> selectByUserId(String user_id){
        return addressService.selectByUserId(user_id);
    }
}
