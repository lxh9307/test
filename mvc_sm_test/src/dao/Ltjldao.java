package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import entity.Users;

@Repository
public interface Ltjldao {
	 //历史聊天记录的接口
	 /**
	 userid  当前用户ID
	 hyid    选中好友的ID
	 用这两个参数去查询聊天记录表，查看历史聊天记录
	 **/
     public List queryAll_Ltjl(int userid,int hyid);
}
