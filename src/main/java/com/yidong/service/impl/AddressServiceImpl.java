package com.yidong.service.impl;

import com.yidong.mapper.AddressMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yidong.model.Address;
import com.yidong.service.AddressService;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressMapper addressMapper;

    public List<Address> selectByUserId(String user_id) {
        return addressMapper.selectByUserId(user_id);
    }
}
