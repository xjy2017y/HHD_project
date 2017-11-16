package com.hhd.dao;

import java.util.List;

import com.hhd.pojo.CarLinkTyreInfo;

public interface CarLinkTyreInfoMapper {
    int deleteByPrimaryKey(Integer linkedid);

    int insert(CarLinkTyreInfo record);

    int insertSelective(CarLinkTyreInfo record);

    CarLinkTyreInfo selectByPrimaryKey(Integer linkedid);

    int updateByPrimaryKeySelective(CarLinkTyreInfo record);

    int updateByPrimaryKey(CarLinkTyreInfo record);
    
    List<CarLinkTyreInfo> selectByGarageID(Integer garageID);
    
    CarLinkTyreInfo selectByGarageIDAndPosition(CarLinkTyreInfo record);
}