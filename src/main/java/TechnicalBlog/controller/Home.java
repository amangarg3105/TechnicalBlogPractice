package TechnicalBlog.controller;


import TechnicalBlog.model.Post;
import TechnicalBlog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

	@Autowired
	PostService postService;

	@RequestMapping("/")
	public String getAllPosts(Model model) {
		Post post = postService.getPost();
		model.addAttribute("posts", post);
		return "index";
	}

}
