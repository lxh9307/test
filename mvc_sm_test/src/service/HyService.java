package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.Hydao;
import dao.Regdao;
import entity.Users;

@Transactional
@Service
public class HyService {
	  @Autowired 
	   Hydao hydao;
	  
	  public List queryAll_Hy(int userid){
		  return hydao.queryAll_Hy(userid);
	  }

}
