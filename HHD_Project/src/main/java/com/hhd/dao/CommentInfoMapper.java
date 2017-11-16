package com.hhd.dao;

import com.hhd.pojo.CommentInfo;

public interface CommentInfoMapper {
    int deleteByPrimaryKey(Integer commentid);

    int insert(CommentInfo record);

    int insertSelective(CommentInfo record);

    CommentInfo selectByPrimaryKey(Integer commentid);

    int updateByPrimaryKeySelective(CommentInfo record);

    int updateByPrimaryKey(CommentInfo record);
}