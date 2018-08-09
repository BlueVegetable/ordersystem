package com.yidong.mapper;

import com.yidong.model.GoodsPicture;

public interface GoodsPictureMapper {
    int deleteByPrimaryKey(String id);

    int insert(GoodsPicture record);

    int insertSelective(GoodsPicture record);

    String[] selectByGoodsId(String goodsId);

    GoodsPicture selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GoodsPicture record);

    int updateByPrimaryKey(GoodsPicture record);
}