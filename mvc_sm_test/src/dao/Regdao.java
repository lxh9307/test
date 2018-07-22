package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Users;

@Repository
public interface Regdao {
		//public List queryAll_hy();
	//	public List queryAll_ltjl();
		public List queryAll_users();
		public int adduser(Users user);
}
