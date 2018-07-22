package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Users;

@Repository
public interface Hydao {
	 //显示好友列表的接口
	 /**
	 userid 当前用户ID 
	 用当前用户ID查询好友表，然后用好友表中HYID去查询用户表，查出相应信息循环显示
	 **/
	 public List queryAll_Hy(int userid);
	
}
