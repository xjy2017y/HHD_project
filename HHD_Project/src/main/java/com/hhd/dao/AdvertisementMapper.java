package com.hhd.dao;

import com.hhd.pojo.Advertisement;

public interface AdvertisementMapper {
    int deleteByPrimaryKey(Integer adid);

    int insert(Advertisement record);

    int insertSelective(Advertisement record);

    Advertisement selectByPrimaryKey(Integer adid);

    int updateByPrimaryKeySelective(Advertisement record);

    int updateByPrimaryKey(Advertisement record);
}