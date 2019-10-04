package TechnicalBlog.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean isLogin(String username, String password) {
		if(username.equals("validuser")) {
			return true;
		}
		return false;
	}
}
