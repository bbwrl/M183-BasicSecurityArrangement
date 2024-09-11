package ch.bbw.example;

import ch.bbw.wysiwyg.BlogDBSimulator;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
class BlogPostServiceTests {

    @Test
    void emptyTest() {
        BlogDBSimulator blogDBSimulator = new BlogDBSimulator();
        assertTrue(blogDBSimulator.getBlogPosts().size()==0);
    }

    @Test
    void addSimpleTest() {
        // TODO: Test1 goes here
    }

    @Test
    void addTestWithTags() {
        // TODO: Test2 goes here
    }

    @Test
    void addTestWithtCSSStyle () {
        // TODO: Test3 goes here
    }

    @Test
    void addTestWithScript() {
        // TODO: Test4 goes here
    }
}
