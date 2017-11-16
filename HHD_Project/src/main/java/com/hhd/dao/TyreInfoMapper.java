package com.hhd.dao;

import java.util.List;

import com.hhd.pojo.TyreInfo;

public interface TyreInfoMapper {
    int deleteByPrimaryKey(Integer tyreid);

    int insert(TyreInfo record);

    int insertSelective(TyreInfo record);

    TyreInfo selectByPrimaryKey(Integer tyreid);

    int updateByPrimaryKeySelective(TyreInfo record);

    int updateByPrimaryKey(TyreInfo record);
    
    List<String> selectBrand();

	List<String> selectStreakByBrand(String brand);

	List<TyreInfo> selectTyreInfoByStreak(String streak);

	List<TyreInfo> selectTyreInfoByName(String name);
}