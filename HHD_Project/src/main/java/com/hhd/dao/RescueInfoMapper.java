package com.hhd.dao;

import com.hhd.pojo.RescueInfo;

public interface RescueInfoMapper {
    int deleteByPrimaryKey(Integer rescueid);

    int insert(RescueInfo record);

    int insertSelective(RescueInfo record);

    RescueInfo selectByPrimaryKey(Integer rescueid);

    int updateByPrimaryKeySelective(RescueInfo record);

    int updateByPrimaryKey(RescueInfo record);
}