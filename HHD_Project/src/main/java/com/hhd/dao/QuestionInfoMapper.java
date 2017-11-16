package com.hhd.dao;

import com.hhd.pojo.QuestionInfo;

public interface QuestionInfoMapper {
    int deleteByPrimaryKey(Integer questionid);

    int insert(QuestionInfo record);

    int insertSelective(QuestionInfo record);

    QuestionInfo selectByPrimaryKey(Integer questionid);

    int updateByPrimaryKeySelective(QuestionInfo record);

    int updateByPrimaryKey(QuestionInfo record);
}