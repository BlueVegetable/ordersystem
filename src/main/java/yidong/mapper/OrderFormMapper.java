package yidong.mapper;

import yidong.model.OrderForm;

public interface OrderFormMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderForm record);

    int insertSelective(OrderForm record);

    OrderForm selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderForm record);

    int updateByPrimaryKey(OrderForm record);
}