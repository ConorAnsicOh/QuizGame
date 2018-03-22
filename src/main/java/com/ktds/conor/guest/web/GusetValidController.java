package com.ktds.conor.guest.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ktds.conor.guest.service.GuestService;

@Controller
public class GusetValidController {

	private GuestService guestService;
	
	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}
	
	@RequestMapping("api/exists/userId")
	@ResponseBody
	public Map<String, Boolean> apiIsExistsId(@RequestParam String userId) {
		
		boolean isExists = guestService.readCountGuestUserId(userId);
		
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("response", isExists);
		
		return response;
	}
}
