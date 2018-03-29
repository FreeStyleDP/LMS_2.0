package practice.project.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import practice.project.entity.User;
import practice.project.service.LoginException;
import practice.project.service.NameException;
import practice.project.service.PasswordException;
import practice.project.service.UserService;
import practice.project.util.JsonResult;

@Controller
@RequestMapping("/login")
public class LoginController extends ExceptionController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/checkUser.do")
	@ResponseBody
	public JsonResult checkUser(String userName,String password,String status,HttpServletRequest req,HttpServletResponse res){
		User user = userService.checkUser(userName,password,status, req, res);
		return new JsonResult("");
	}
	
	@RequestMapping("/quit.do")
	public String quit(HttpServletRequest req){
		req.getSession().removeAttribute("user");
		return "redirect:/html/login.html";
	}
	
	/*
	 * 2£∫’À∫≈¥ÌŒÛ
	 * 3£∫√‹¬Î¥ÌŒÛ
	 * 4£∫’À∫≈“—µ«¬º
	 */
	@ExceptionHandler(NameException.class)
	@ResponseBody
	public JsonResult nameExp(NameException e){
		e.printStackTrace();
		return new JsonResult(2,e);
	}
	
	@ExceptionHandler(PasswordException.class)
	@ResponseBody
	public JsonResult passwordExp(PasswordException e){
		e.printStackTrace();
		return new JsonResult(3,e);
	}
	
	@ExceptionHandler(LoginException.class)
	@ResponseBody
	public JsonResult loginExp(LoginException e){
		e.printStackTrace();
		return new JsonResult(4,e);
	}
}
