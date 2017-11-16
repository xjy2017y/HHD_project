package com.hhd.dao;

import com.hhd.pojo.BillInfo;

public interface BillInfoMapper {
    int deleteByPrimaryKey(Integer billid);

    int insert(BillInfo record);

    int insertSelective(BillInfo record);

    BillInfo selectByPrimaryKey(Integer billid);

    int updateByPrimaryKeySelective(BillInfo record);

    int updateByPrimaryKey(BillInfo record);
}