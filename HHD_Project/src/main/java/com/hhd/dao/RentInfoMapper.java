package com.hhd.dao;

import com.hhd.pojo.RentInfo;

public interface RentInfoMapper {
    int deleteByPrimaryKey(Integer rentid);

    int insert(RentInfo record);

    int insertSelective(RentInfo record);

    RentInfo selectByPrimaryKey(Integer rentid);

    int updateByPrimaryKeySelective(RentInfo record);

    int updateByPrimaryKey(RentInfo record);
}