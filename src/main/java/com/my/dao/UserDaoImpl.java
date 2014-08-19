package com.my.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

import com.my.model.User;

@Component
public class UserDaoImpl implements UserDao {

	private SqlSession sqlSession;
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	@Resource
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int addUser(User user) {
		int rows = sqlSession.insert("com.my.dao.UserDao.addUser", user);
		return rows;
	}

	@Override
	public int userExists(String username) {
		int c = sqlSession.selectOne("com.my.dao.UserDao.userExists", username);
		return c;
	}

}
