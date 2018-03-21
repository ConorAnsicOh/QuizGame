package com.ktds.conor.guest.dao;

import com.ktds.conor.guest.vo.GuestVO;

public interface GuestDao {
	
	public int insertGuest(GuestVO guestVO);

	public GuestVO selectGuest(GuestVO guestVO);
}
