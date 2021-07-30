package com.testing.xlt.User;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserController {
	private UserService userService;
	
	@GetMapping("/user1/signup")
	public String dispSignUp(UserDto userDto) {
		return "/User/signup";
	}
	@GetMapping("/user1/login")
	public String dispLogin(UserDto userDto) {
		return "/User/login";
	}
	@PostMapping("/user1/signup")
	public String execSignup(@Valid UserDto userDto, Errors errors, Model model) {
		if(errors.hasErrors()) {
			//회원 가입 실패시 , 입력 데이터를 유지
			model.addAttribute("userDto",userDto);
			// 유효성 통과 못한 필드와 메시지를 핸들링
			Map<String,String> validatorResult = userService.validateHandling(errors);
			for(String key: validatorResult.keySet()) {
				model.addAttribute(key,validatorResult.get(key));
			}
			return "/User/signup";
		}
		userService.signUp(userDto);
		return "redirect:/user1/login";
	}
}
