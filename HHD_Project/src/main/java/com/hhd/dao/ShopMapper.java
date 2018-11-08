package com.hhd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hhd.pojo.Shop;

public interface ShopMapper {
    int deleteByPrimaryKey(Integer shopid);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer shopid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
    
    List<Integer> selectIdByHavingShop(@Param("page")int page,@Param("pageSize")int pageSize);

	List<Shop> queryShopBysuperiorIDAndState(@Param("page")int page, @Param("pageSize")int pageSize,
			@Param("superiorID")int superiorID, @Param("state")int state);

	List<Shop> queryAllShopLimit(@Param("page")int page, @Param("pageSize")int pageSize);

	List<Shop> queryAllShop();

	List<Shop> queryByInfo(String describe);

    List<Shop> queryShopByUser(@Param("userID")int userID,@Param("page")int page,@Param("pageSize")int pageSize);
}