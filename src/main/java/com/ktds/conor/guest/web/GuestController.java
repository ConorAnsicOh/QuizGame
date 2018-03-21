package com.ktds.conor.guest.web;

import java.util.List;

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
	
	@RequestMapping("/signUp")
	public String viewSignUpPage() {
		return "guest/signUpView";
	}

	@RequestMapping("/howToPlay")
	public String viewHowToPlayPage() {
		return "guest/howToPlayView";
	}
	
	@RequestMapping("/postQuiz")
	public String viewPostQuizPage() {
		return "share/postQuizView";
	}
}
