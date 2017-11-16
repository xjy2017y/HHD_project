package com.hhd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hhd.pojo.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
    
    UserInfo selectByAssPhone(String assPhone);
    
    int selectIdByAssPhone(String assPhone);

	List<UserInfo> selectUserByIdList(List<Integer> idList);
}