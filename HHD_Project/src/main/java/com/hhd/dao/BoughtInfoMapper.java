package com.hhd.dao;

import com.hhd.pojo.BoughtInfo;

public interface BoughtInfoMapper {
    int deleteByPrimaryKey(Integer boughtid);

    int insert(BoughtInfo record);

    int insertSelective(BoughtInfo record);

    BoughtInfo selectByPrimaryKey(Integer boughtid);

    int updateByPrimaryKeySelective(BoughtInfo record);

    int updateByPrimaryKey(BoughtInfo record);
}