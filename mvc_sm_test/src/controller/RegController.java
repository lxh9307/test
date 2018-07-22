package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.org.apache.regexp.internal.recompile;

import entity.Users;

import service.RegService;

@Controller
@RequestMapping("/test")
public class RegController {
	@Autowired
	 RegService regService;
	
	@RequestMapping("/queryAllUsers")
	public String queryAll(ModelMap map){
		List<Users> list=regService.queryAll_users();
		map.put("list", list);
		return "/index.jsp";
	}
	
	@RequestMapping("/addusers")
	public String adduser(HttpServletResponse response,HttpServletRequest request,Users user){
        System.out.println("进来了。、。。。。。");
		//String usermame=request.getParameter("usermame");
		//String password=request.getParameter("password");
		//return "/zhuce.jsp";
	//	System.out.println("ssssssssss"+usermame+"----"+password);
		return "";
	}
}
