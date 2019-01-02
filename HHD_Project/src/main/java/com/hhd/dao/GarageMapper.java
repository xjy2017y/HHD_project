package com.hhd.dao;

import java.util.List;

import com.hhd.pojo.CarInfo;
import com.hhd.pojo.Garage;

public interface GarageMapper {
    int deleteByPrimaryKey(Integer garageid);

    int insert(Garage record);

    int insertSelective(Garage record);

    Garage selectByPrimaryKey(Integer garageid);

    int updateByPrimaryKeySelective(Garage record);

    int updateByPrimaryKey(Garage record);
    /**
     * 根据车牌号搜索车辆
     * @param vechicleNum
     * @return
     */
    List<CarInfo> selectByvehicleINum(String vechicleNum);
    
    List<Garage> selectByUserID(Integer userID);

    Garage selectByCarNum(String carNum);
}