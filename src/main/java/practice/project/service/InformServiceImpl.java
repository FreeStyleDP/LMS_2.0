package practice.project.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import practice.project.dao.InformMapper;
import practice.project.entity.Inform;
import practice.project.entity.User;
import practice.project.util.Util;

@Service("informService")
public class InformServiceImpl implements InformService{
	
	@Resource
	private InformMapper informMapper;
	@Autowired
	private HttpServletRequest request;
	
	public HashMap<Integer,List<Inform>> selectInformByCondition(String title, String managerId, Date showTime,Integer pageStart, Integer pageSize) throws FormateException {
		if(showTime!=null && !(showTime instanceof Date)){
			throw new FormateException("展示时间格式不对！");
		}
		if(title != null){
			title = "%"+title+"%";
		}
		Inform inform = new Inform();
		inform.setTitle(title);
		inform.setManagerId(managerId);
		inform.setShowTime(showTime);
		inform.setPageStart(pageStart);
		inform.setPageSize(pageSize);
		List<Inform> list = informMapper.selectByCondition(inform);
		int total = 0;
		if(pageSize != null && pageStart != null){
			total = informMapper.selectTotalByCondition(inform);
		}
		HashMap<Integer, List<Inform>> hashMap = new HashMap<Integer,List<Inform>>();
		hashMap.put(total, list);
		return hashMap;
	}


	public int insertInform(String title, String content,String userCode) throws TitleException {
		if(title == null || title.trim().isEmpty()){
			throw new TitleException("标题格式不正确");
		}
		Inform record = new Inform();
		record.setContent(content);
		record.setTitle(title);
		record.setId(Util.createId());
		record.setShowTime(new Date());
		User user = (User) request.getSession().getAttribute("user");
		record.setManagerId(user.getUserCode());
		int insert = informMapper.insert(record);
		return insert;
	}

}
