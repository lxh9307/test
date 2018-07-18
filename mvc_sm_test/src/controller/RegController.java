package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Users;

import service.RegService;

@Controller
@RequestMapping("/test")
public class RegController {
	@Autowired 
	private RegService rs;
	
	@RequestMapping("/queryAll")
	public String queryAll(ModelMap map){
		List<Users> list=rs.queryAll_users();
		map.put("list", list);
		return "/index.jsp";
	}
}
