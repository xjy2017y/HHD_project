package com.hhd.dao;

import com.hhd.pojo.OrderInfo;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}