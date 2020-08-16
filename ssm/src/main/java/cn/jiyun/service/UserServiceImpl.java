package cn.jiyun.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiyun.mapper.DeptMapper;
import cn.jiyun.mapper.EmployeeMapper;
import cn.jiyun.mapper.UserMapper;
import cn.jiyun.pojo.Dept;
import cn.jiyun.pojo.Employee;
import cn.jiyun.pojo.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{


	@Autowired
	DeptMapper deptMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<Employee> findAll(Employee employee) {
		return employeeMapper.findAll(employee);
	}
	@Override
	public List<Dept> findDepts() {
		return deptMapper.findDepts();
	}
	@Override
	public void add(Employee employee) {
		employeeMapper.add(employee);
	}
	@Override
	public void del(Integer eid) {
		employeeMapper.del(eid);
	}
	@Override
	public Employee findByid(Integer eid) {
		return employeeMapper.findByid(eid);
	}
	@Override
	public void update(Employee employee) {
		employeeMapper.update(employee);
	}
	@Override
	public List<User> findUsernameAndPassword(User user) {
		return userMapper.findUsernameAndPassword(user);
	}
	@Override
	public List<User> findUsername(String username) {
		return userMapper.findUsername(username);
	}
	@Override
	public void regist(User user) {
		userMapper.regist(user);
	}
	@Override
	public void delAll(Integer[] ids) {
		employeeMapper.delAll(ids);
	}
	
	
}
