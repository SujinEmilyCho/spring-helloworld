package wooteco.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import wooteco.helloworld.jdbc.relation.Article;
import wooteco.helloworld.jdbc.relation.ArticleRepository;
import wooteco.helloworld.jdbc.relation.Author;
import wooteco.helloworld.jdbc.relation.AuthorRepository;

@RestController
public class Controller {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/")
    public String index() {
        Author author = authorRepository.save(new Author("브라운"));
        Article article = articleRepository.save(new Article("title", "content", author));
        return "hi";
    }
}
