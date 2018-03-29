package practice.project.service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import practice.project.dao.UserMapper;
import practice.project.entity.User;
import practice.project.util.Util;

@Service("userServic")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	public User checkUser(String userName, String password,String status,HttpServletRequest req,HttpServletResponse res) throws NameException, PasswordException, LoginException {
		if(userName == null || userName.trim().isEmpty()){
			throw new NameException("�û���Ϊ�գ�");
		}
		if(password == null ){
			throw new PasswordException("����Ϊ�գ�");
		}
		User user = userMapper.selectByPrimaryKey(userName);
		if(user == null){
			throw new NameException("�û��������ڣ�");
		}
		password = Util.md5(password);
		if(!password.equals(user.getPassword())){
			throw new PasswordException("�������");
		}
		HttpSession session = req.getSession();
		User userSession = (User) session.getAttribute("user");
//		stop:ֹͣ����ظ���¼
		if(!"stop".equals(status)){
			if(userSession != null && userName.equals(userSession.getUserCode())){
				throw new LoginException("�˺��Ѵ��ڣ�");
			}
		}
		session.setAttribute("user", user);
		String hello = "";
		if(user.getToken()==1){
			hello = "����"+user.getName()+"���ã�";
		}else if(user.getToken()==2){
			hello = "����Ա"+user.getName()+"���ã�";
		}else if(user.getToken()==3){
			hello = "��������Ա"+user.getName()+"���ã�";
		}
		Cookie c1 = null;
		try {
			c1 = new Cookie("hello",URLEncoder.encode(hello,"utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		Cookie c2 = new Cookie("userCode", user.getUserCode());
		Cookie c3 = new Cookie("token",user.getToken().toString());
		c1.setPath("/");
		c2.setPath("/");
		c3.setPath("/");
		res.addCookie(c1);
		res.addCookie(c2);
		res.addCookie(c3);
		return user;
	}
}
