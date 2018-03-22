package com.ktds.conor.guest.service;

import com.ktds.conor.guest.vo.GuestVO;

public interface GuestService {

	public boolean	createGuest (GuestVO guestVO);
	
	public GuestVO	readGuest (GuestVO guestVO);
	
	public boolean readCountGuestUserId(String userId);
}
