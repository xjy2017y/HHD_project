package com.hhd.dao;

import java.util.List;

import com.hhd.pojo.ShopPic;

public interface ShopPicMapper {
    int deleteByPrimaryKey(Integer pictureid);

    int insert(ShopPic record);

    int insertSelective(ShopPic record);

    ShopPic selectByPrimaryKey(Integer pictureid);

    int updateByPrimaryKeySelective(ShopPic record);

    int updateByPrimaryKey(ShopPic record);
    
    int insertAll(List<ShopPic> records);
}