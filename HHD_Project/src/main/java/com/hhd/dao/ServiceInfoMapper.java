package com.hhd.dao;

import com.hhd.pojo.ServiceInfo;

public interface ServiceInfoMapper {
    int deleteByPrimaryKey(Integer startid);

    int insert(ServiceInfo record);

    int insertSelective(ServiceInfo record);

    ServiceInfo selectByPrimaryKey(Integer startid);

    int updateByPrimaryKeySelective(ServiceInfo record);

    int updateByPrimaryKey(ServiceInfo record);
}