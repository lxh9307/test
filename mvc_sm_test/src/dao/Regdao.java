package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface Regdao {
		public List queryAll_hy();
		public List queryAll_ltjl();
		public List queryAll_users();
}
