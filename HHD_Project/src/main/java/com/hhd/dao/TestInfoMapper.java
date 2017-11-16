package com.hhd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hhd.pojo.TestInfo;

public interface TestInfoMapper {
    int deleteByPrimaryKey(Integer testid);

    int insert(TestInfo record);

    int insertSelective(TestInfo record);

    TestInfo selectByPrimaryKey(Integer testid);

    int updateByPrimaryKeySelective(TestInfo record);

    int updateByPrimaryKey(TestInfo record);
    
    List<TestInfo> selectByLinkedID(@Param("linkedID")int linkedID,@Param("page")int page,@Param("pageSize")int pageSize);
}