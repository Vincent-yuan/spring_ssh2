package cn.vincent.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;

import cn.vincent.service.UserService;
import cn.vincent.vo.User;

@Controller
@Scope("prototype")
public class UserAction {

	private List<User> list;
	@Autowired
	private UserService userService;
	
	public String list(){
		list=userService.findAll();
		return Action.SUCCESS;
	}
	
	
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	
}
