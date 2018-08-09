package com.yidong.mapper;

import com.yidong.model.Goods;

import java.util.List;
import java.util.Map;

public interface GoodsMapper {
    int deleteByPrimaryKey(String id);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(String id);

    List<Goods> selectByName(String name);

    List<Goods> selectByState(Map<String,Integer> nums);

    List<Goods> selectAll(int num);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}