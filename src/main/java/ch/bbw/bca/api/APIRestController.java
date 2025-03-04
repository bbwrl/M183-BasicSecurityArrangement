package ch.bbw.bca.api;

import ch.bbw.bca.BlogDBSimulator;
import ch.bbw.bca.model.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("blogpost")
public class APIRestController {

    private BlogDBSimulator blogDBSimulator;

    @Autowired
    public APIRestController(BlogDBSimulator blogDBSimulator) {
        this.blogDBSimulator = blogDBSimulator;
    }

    @PostMapping()
    public ResponseEntity<BlogPost> addPost(@RequestBody BlogPost blogPost) {
        blogDBSimulator.add(blogPost);
        return ResponseEntity.ok(blogPost);
    }
}
