package TechnicalBlog.controller;

import TechnicalBlog.model.User;
import TechnicalBlog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@Autowired
	LoginService loginService;

	@RequestMapping("users/login")
	public String login() {
		return "users/login";
	}

	@RequestMapping(value = "users/login", method = RequestMethod.POST)
	public String login(User user, Model model) {

		String username = user.getUsername();
		String password = user.getPassword();

		String output = username + "  " + password;
		System.out.println(output);
//		model.addAttribute("Users", username);
//		model.addAttribute("Password", password);


		boolean isLogin = loginService.isLogin(username, null);
		if(isLogin) {
			model.addAttribute("Users", user);
			return "posts";
		}
		return "index";
	}


}
