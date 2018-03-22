package com.ktds.conor.guest.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ktds.conor.guest.service.GuestService;
import com.ktds.conor.guest.vo.GuestVO;

@Controller
public class GuestController {

	private GuestService guestService;
	
	public void setGuestService(GuestService guestService) {
		this.guestService = guestService;
	}
	
	@RequestMapping("/")
	public ModelAndView viewMainPage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("share/loginView");
		
		return view;
	}
	@RequestMapping( value = "/signIn", method = RequestMethod.POST)
	public ModelAndView goGuestMainView(@ModelAttribute("loginForm") @Valid GuestVO guestVO, Errors errors) {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("guest/guestMainView");
		
		return view;
	}
	
	@RequestMapping( value = "/signIn", method = RequestMethod.GET)
	public ModelAndView viewGuestMainView() {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("guest/guestMainView");
		
		return view;
	}
	
	//TODO 여기부터 >> LOGINVIEW에서 정보오면 확인하는 곳.
	@RequestMapping( value="/login", method = RequestMethod.POST )
	public ModelAndView viewGuestMainView(@ModelAttribute("loginForm") @Valid GuestVO guestVO, Errors errors, HttpSession session, HttpServletRequest request) {
		
		
		return new ModelAndView("redirect:/guestMainView");
	}
	
//	-------------------------------------------------------------------미완료
//	-------------------------------------------------------------------완료
	@RequestMapping( value="signUp", method = RequestMethod.GET)
	public String viewSignUpView() {
		return "guest/signUpView";
	}
	
	
	@RequestMapping( value="/signUp", method = RequestMethod.POST )
	public ModelAndView doSignUpGuest(@ModelAttribute("registForm") @Valid GuestVO guestVO, Errors errors) {
		
		if (errors.hasErrors()) {
			return new ModelAndView("guest/signUpView");
		}
		if (guestService.createGuest(guestVO)) {
			return new ModelAndView("share/loginView");
		}

		return new ModelAndView("guest/signUpView");
	}
//	-------------------------------------------------------------------완료
//	-------------------------------------------------------------------미완료

	
}
