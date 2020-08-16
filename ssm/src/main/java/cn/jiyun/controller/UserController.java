package cn.jiyun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.jiyun.pojo.Dept;
import cn.jiyun.pojo.Employee;
import cn.jiyun.pojo.PageVo;
import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;

@Controller
@ResponseBody
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping("findAll")
	public PageInfo<Employee> findAll(@RequestBody PageVo pageVo){
		PageHelper.startPage(pageVo.getPageNum(), 2);
		System.out.println(pageVo);
		List<Employee> list = userService.findAll(pageVo.getEmployee());
		
		PageInfo<Employee> page = new PageInfo<>(list);
		return page;
	}
	
	@RequestMapping("findDepts")
	public List<Dept> findDepts(){
		return userService.findDepts();
	}
	
	@RequestMapping("add")
	public String add(@RequestBody Employee employee){
		Integer eid = employee.getEid();
		if(eid==null){
			userService.add(employee);
		}else{
			userService.update(employee);
		}
		return "0";
	}
	@RequestMapping("del")
	public String del(Integer eid){
		userService.del(eid);
		return "0";
	}
	
	@RequestMapping("findByid")
	public Employee findByid(Integer eid){
		return userService.findByid(eid);
	}
	
	@RequestMapping("login")
	public String login(@RequestBody User user){
		List<User> list = userService.findUsernameAndPassword(user);
		// 返回一下list集合长度
		return list.size()+"";
		
	}
	
	@RequestMapping("findUsername")
	public String findUsername(String username){
		List<User> list = userService.findUsername(username);
		return list.size()+"";
	} 

	@RequestMapping("regist")
	public String regist(@RequestBody User user){
		
		userService.regist(user);
		
		return "";
	}
	
	@RequestMapping("delAll")
	public String delAll(@RequestBody Integer[] ids){
		userService.delAll(ids);
		return "";
	}
}
