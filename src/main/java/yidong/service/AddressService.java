package yidong.service;

import yidong.model.Address;

import java.util.List;

public interface AddressService {
    List<Address> selectByUserId(String user_id);
}
