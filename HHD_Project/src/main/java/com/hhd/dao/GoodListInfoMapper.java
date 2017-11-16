package com.hhd.dao;

import com.hhd.pojo.GoodListInfo;

public interface GoodListInfoMapper {
    int deleteByPrimaryKey(Integer goodlistid);

    int insert(GoodListInfo record);

    int insertSelective(GoodListInfo record);

    GoodListInfo selectByPrimaryKey(Integer goodlistid);

    int updateByPrimaryKeySelective(GoodListInfo record);

    int updateByPrimaryKey(GoodListInfo record);
}