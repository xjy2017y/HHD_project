package com.hhd.dao;

import java.util.List;

import com.hhd.pojo.CarInfo;

public interface CarInfoMapper {
    int deleteByPrimaryKey(Integer vechiclesid);

    int insert(CarInfo record);

    int insertSelective(CarInfo record);

    CarInfo selectByPrimaryKey(Integer vechiclesid);

    int updateByPrimaryKeySelective(CarInfo record);

    int updateByPrimaryKey(CarInfo record);
    
    List<String> selectBrandByLatter(String latter);
    
    List<String> selectSeriesByBrand(String brand);
    
    List<CarInfo> selectCarInfoBySeries(String series);
    
    List<CarInfo> queryCarInfoByVechiclesID(int vechiclesID);
}