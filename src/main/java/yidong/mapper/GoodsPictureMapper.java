package yidong.mapper;

import yidong.model.GoodsPicture;

public interface GoodsPictureMapper {
    int deleteByPrimaryKey(String id);

    int insert(GoodsPicture record);

    int insertSelective(GoodsPicture record);

    GoodsPicture selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(GoodsPicture record);

    int updateByPrimaryKey(GoodsPicture record);
}