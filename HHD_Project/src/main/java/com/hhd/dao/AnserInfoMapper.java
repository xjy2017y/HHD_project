package com.hhd.dao;

import com.hhd.pojo.AnserInfo;

public interface AnserInfoMapper {
    int deleteByPrimaryKey(Integer answerid);

    int insert(AnserInfo record);

    int insertSelective(AnserInfo record);

    AnserInfo selectByPrimaryKey(Integer answerid);

    int updateByPrimaryKeySelective(AnserInfo record);

    int updateByPrimaryKey(AnserInfo record);
}