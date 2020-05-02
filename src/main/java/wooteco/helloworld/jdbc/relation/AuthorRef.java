package wooteco.helloworld.jdbc.relation;

import org.springframework.data.relational.core.mapping.Table;

@Table("article_author")
public class AuthorRef {
    private Long author;

    public AuthorRef(Long author) {
        this.author = author;
    }

    public Long getAuthor() {
        return author;
    }

    public void setAuthor(Long author) {
        this.author = author;
    }
}
