package practice.project.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import practice.project.entity.Inform;

public interface InformService {
	
	public HashMap<Integer,List<Inform>> selectInformByCondition(String title,String managerId,Date showTime,Integer pageStart, Integer pageSize) throws FormateException;
	int insertInform(String title,String content,String userCode) throws TitleException;
}
