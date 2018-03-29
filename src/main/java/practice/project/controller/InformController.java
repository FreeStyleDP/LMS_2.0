package practice.project.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import practice.project.entity.Inform;
import practice.project.service.FormateException;
import practice.project.service.InformService;
import practice.project.service.TitleException;
import practice.project.util.JsonResult;

@Controller
@RequestMapping("/inform")
public class InformController extends ExceptionController{
	
	@Resource
	private InformService informService;
	
	@ResponseBody
	@RequestMapping("/findInform.do")
		public JsonResult findInfrom(String title,String managerId,String showTime,String pageStart,String pageSize){
		Date time = null;
		
//		try {
//			System.out.println(URLDecoder.decode(managerId,"utf-8"));
//		} catch (UnsupportedEncodingException e1) {
//			e1.printStackTrace();
//		}
		System.out.println(title);
		System.out.println(showTime);
		if(showTime != null && !showTime.trim().isEmpty()){
			SimpleDateFormat sdf = new SimpleDateFormat("yyy-mm-dd");
			try {
				time = sdf.parse(showTime);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			System.out.println(time);
		}
		Integer pageSize1 =null;
		if(pageSize != null && !pageSize.trim().isEmpty()){
			pageSize1 = Integer.parseInt(pageSize);
		}
		Integer pageStart1 =null;
		if(pageStart != null && !pageStart.trim().isEmpty()){
			pageStart1 = Integer.parseInt(pageStart);
		}
		if(managerId != null && "".equals(managerId.trim())){
			managerId = null;
		}
		HashMap<Integer, List<Inform>> map = informService.selectInformByCondition(title, managerId,time,pageStart1,pageSize1);
		int key = 0;
		List<Inform> list = null;
		for (Integer k : map.keySet()) {
			key = k;
		}
		if(pageSize1!=null && pageStart1!=null){
			return new JsonResult(map.get(key),key);
					
		}else{
			return new JsonResult(map.get(key));
		}
	}
	
	@RequestMapping("/insertInform.do")
	@ResponseBody
	public JsonResult inserInform(String title,String content,HttpServletRequest req){
		HttpSession session = req.getSession();
		String userCode = (String) session.getAttribute("userCode");
		int result = informService.insertInform(title, content,userCode);
		return new JsonResult(result);
	}
	
	@ExceptionHandler(FormateException.class)
	@ResponseBody
	public JsonResult FormateExc(FormateException e){
		e.printStackTrace();
		return new JsonResult(2,e);
	}
	
	@ExceptionHandler(TitleException.class)
	@ResponseBody
	public JsonResult TitleExc(TitleException e){
		e.printStackTrace();
		return new JsonResult(2,e);
	}
}
