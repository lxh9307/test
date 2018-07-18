package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.Regdao;

@Service
@Transactional
public class RegService {
	  @Autowired 
	  private Regdao regdao;
	  
	  public List queryAll(){
		   return regdao.queryAll();
	  }
}
