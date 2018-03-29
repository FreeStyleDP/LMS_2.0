package practice.project.dao;

import java.util.List;

import practice.project.entity.Inform;

public interface InformMapper {
    int deleteByPrimaryKey(String id);

    int insert(Inform record);

    int insertSelective(Inform record);

    Inform selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Inform record);

    int updateByPrimaryKeyWithBLOBs(Inform record);

    int updateByPrimaryKey(Inform record);
    
    List<Inform> selectByCondition(Inform record);
    
    int selectTotalByCondition(Inform record);
}