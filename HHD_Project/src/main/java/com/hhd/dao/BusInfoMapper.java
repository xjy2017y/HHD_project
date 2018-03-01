package com.hhd.dao;

import com.hhd.pojo.BusInfo;

public interface BusInfoMapper {
    int deleteByPrimaryKey(Integer busid);

    int insert(BusInfo record);

    int insertSelective(BusInfo record);

    BusInfo selectByPrimaryKey(Integer busid);

    int updateByPrimaryKeySelective(BusInfo record);

    int updateByPrimaryKey(BusInfo record);
}