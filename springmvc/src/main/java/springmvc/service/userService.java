package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.model.user;
import springmvc.dao.userDao;

@Service
public class userService {

	@Autowired
	private userDao uDao;
	public int createUser(user u) {
		return this.uDao.saveUser(u);
		
		
	}

}
