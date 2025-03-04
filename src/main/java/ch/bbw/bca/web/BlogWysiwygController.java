package ch.bbw.bca.web;

import ch.bbw.bca.BlogDBSimulator;
import ch.bbw.bca.model.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/wysiwyg")
public class BlogWysiwygController {

    private BlogDBSimulator blogDBSimulator;

    @Autowired
    public BlogWysiwygController(BlogDBSimulator blogDBSimulator) {
        this.blogDBSimulator = blogDBSimulator;
    }

    @GetMapping("simpleForm")
    public String home(Model model) {
        BlogPost blogPost = new BlogPost();
        model.addAttribute("blogPost", blogPost);
        model.addAttribute("blogPosts", blogDBSimulator.getBlogPosts());
        return "wysiwyg/simpleForm";
    }

    @PostMapping("/addPost")
    public String addEditPostSubmit(Model model, BlogPost blogPost) {
        System.out.println("Title is  : " + blogPost.getTitle());
        System.out.println("Message is: " + blogPost.getMessage());
        blogDBSimulator.add(blogPost);

        blogPost = new BlogPost();
        model.addAttribute("blogPost", blogPost);
        model.addAttribute("blogPosts", blogDBSimulator.getBlogPosts());
        return "redirect:/wysiwyg/simpleForm";
    }

}

