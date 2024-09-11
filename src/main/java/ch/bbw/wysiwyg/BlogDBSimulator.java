package ch.bbw.wysiwyg;

import ch.bbw.wysiwyg.BlogPost;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BlogDBSimulator {

    private List<BlogPost> blogPosts = new ArrayList<>();

    public List<BlogPost> getBlogPosts() {
        return blogPosts;
    }

    public void add(BlogPost blogPost) {
        // TODO: add antisamy filtering here

        blogPosts.add(blogPost);
    }
}
