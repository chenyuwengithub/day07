package cn.jiyun.service;

import java.util.List;

import cn.jiyun.pojo.Dept;
import cn.jiyun.pojo.Employee;
import cn.jiyun.pojo.User;

public interface UserService {

	List<Employee> findAll(Employee employee);

	List<Dept> findDepts();

	void add(Employee employee);

	void del(Integer eid);

	Employee findByid(Integer eid);

	void update(Employee employee);
	
	List<User> findUsernameAndPassword(User user);

	List<User> findUsername(String username);

	void regist(User user);

	void delAll(Integer[] ids);

}
