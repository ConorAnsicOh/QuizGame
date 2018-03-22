package com.ktds.conor.guest.service;

import com.ktds.conor.guest.dao.GuestDao;
import com.ktds.conor.guest.vo.GuestVO;

public class GuestServiceImpl implements GuestService {

	private GuestDao guestDao;
	
	public void setGuestDao(GuestDao guestDao) {
		this.guestDao = guestDao;
	}
	
	@Override
	public boolean createGuest(GuestVO guestVO) {
		return guestDao.insertGuest(guestVO) > 0;
	}

	@Override
	public GuestVO readGuest(GuestVO guestVO) {
		return guestDao.selectGuest(guestVO);
	}

	@Override
	public boolean readCountGuestUserId(String userId) {
		return guestDao.selectCountGuestUserId(userId) > 0;
	}

}
