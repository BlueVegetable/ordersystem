package yidong.controller;

import yidong.model.Address;
import yidong.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AddressController {
    @Autowired
    private AddressService addressService;


    /*
      客户管理,获取客户的信息
    */



    @ResponseBody
    @RequestMapping(value = "/selectByUserId" )
    public List<Address> selectByUserId(String user_id){
        user_id="111";
        return addressService.selectByUserId(user_id);
    }
}
