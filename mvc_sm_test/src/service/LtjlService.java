package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.Ltjldao;
import dao.Regdao;
import entity.Users;

@Transactional
@Service
public class LtjlService {
	  @Autowired 
	  Ltjldao ltjldao;
	  
	  public List queryAll_Ltjl(int userid,int hyid) {
		return ltjldao.queryAll_Ltjl(userid, hyid);
	}
}
