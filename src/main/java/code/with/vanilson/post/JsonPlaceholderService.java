package code.with.vanilson.post;

import org.springframework.stereotype.Service;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

@Service
public interface JsonPlaceholderService {
    @GetExchange("/posts")
    List<Post> loadPosts();

}
