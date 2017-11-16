package com.hhd.dao;

import com.hhd.pojo.CarInformation;

public interface CarInformationMapper {
    int deleteByPrimaryKey(Integer infoid);

    int insert(CarInformation record);

    int insertSelective(CarInformation record);

    CarInformation selectByPrimaryKey(Integer infoid);

    int updateByPrimaryKeySelective(CarInformation record);

    int updateByPrimaryKey(CarInformation record);
}