package yidong.mapper;

import yidong.model.BigType;

public interface BigTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(BigType record);

    int insertSelective(BigType record);

    BigType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(BigType record);

    int updateByPrimaryKey(BigType record);
}