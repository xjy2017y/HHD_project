package com.hhd.dao;

import com.hhd.pojo.GoodsListLinkedInfo;

public interface GoodsListLinkedInfoMapper {
    int deleteByPrimaryKey(Integer listid);

    int insert(GoodsListLinkedInfo record);

    int insertSelective(GoodsListLinkedInfo record);

    GoodsListLinkedInfo selectByPrimaryKey(Integer listid);

    int updateByPrimaryKeySelective(GoodsListLinkedInfo record);

    int updateByPrimaryKey(GoodsListLinkedInfo record);
}