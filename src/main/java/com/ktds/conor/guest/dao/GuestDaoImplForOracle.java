package com.ktds.conor.guest.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ktds.conor.guest.vo.GuestVO;

public class GuestDaoImplForOracle  extends SqlSessionDaoSupport implements GuestDao {

	@Override
	public int insertGuest(GuestVO guestVO) {
		return getSqlSession().insert("GuestDao.insertGuest", guestVO);
	}

	@Override
	public GuestVO selectGuest(GuestVO guestVO) {
		return getSqlSession().selectOne("GuestDao.selectGuest", guestVO);
	}

}
