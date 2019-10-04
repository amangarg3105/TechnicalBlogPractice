package TechnicalBlog.service;


import TechnicalBlog.model.Post;
import javafx.geometry.Pos;
import org.springframework.stereotype.Service;

@Service
public class PostService {

      public Post getPost() {
		  Post post = new Post();
		  post.setTitle("UpGrad");
		  post.setDesc("This is upgrad post");
		  return post;
	  }
}
