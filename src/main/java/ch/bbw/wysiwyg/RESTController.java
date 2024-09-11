package ch.bbw.wysiwyg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("blogpost")
public class RESTController {

    private BlogDBSimulator blogDBSimulator;

    @Autowired
    public RESTController(BlogDBSimulator blogDBSimulator) {
        this.blogDBSimulator = blogDBSimulator;
    }

    @PostMapping()
    public ResponseEntity<BlogPost> addPost(@RequestBody BlogPost blogPost) {
        blogDBSimulator.add(blogPost);
        return ResponseEntity.ok(blogPost);
    }
}
