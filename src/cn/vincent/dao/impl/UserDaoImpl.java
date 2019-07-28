package cn.vincent.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.vincent.dao.UserDao;
import cn.vincent.vo.User;

//相当于  <bean id="userDao" class="cn.sxt.dao.impl.UserDaoImpl">
@Repository("userDao")
public class UserDaoImpl implements UserDao{
	//自动注入 在容器中查询 是否存在对应的bean
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<User> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
}
