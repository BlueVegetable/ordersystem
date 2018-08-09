package yidong.service.impl;

import yidong.mapper.AddressMapper;
import yidong.model.Address;
import yidong.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private  AddressMapper addressMapper;

    @Override
    public List<Address> selectByUserId(String user_id) {
     return  addressMapper.selectByUserId(user_id);
    }
}
