package com.hhd.dao;

import com.hhd.pojo.DiscountInfo;

public interface DiscountInfoMapper {
    int insert(DiscountInfo record);

    int insertSelective(DiscountInfo record);
}