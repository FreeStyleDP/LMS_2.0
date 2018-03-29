package practice.project.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;

import practice.project.entity.User;

public interface UserService {
	User checkUser(String userName, String password,String status,HttpServletRequest req,HttpServletResponse res) throws NameException,PasswordException,LoginException;
	
}
