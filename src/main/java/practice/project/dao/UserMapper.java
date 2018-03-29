package practice.project.dao;

import practice.project.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userCode);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userCode);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}