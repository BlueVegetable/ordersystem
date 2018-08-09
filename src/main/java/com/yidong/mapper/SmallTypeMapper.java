package com.yidong.mapper;

import com.yidong.model.SmallType;

public interface SmallTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(SmallType record);

    int insertSelective(SmallType record);

    SmallType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SmallType record);

    int updateByPrimaryKey(SmallType record);
}