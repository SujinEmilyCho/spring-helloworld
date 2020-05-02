package wooteco.helloworld.jdbc.relation;

import org.springframework.data.annotation.Id;

import java.util.HashSet;
import java.util.Set;

public class Article {
    @Id
    private Long id;
    private String title;
    private String content;
    private AuthorRef authorRef;
    private Set<Comment> comments = new HashSet<>();

    // TODO: comments 참조
    // TODO: author 참조

    public Article() {
    }

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Article(String title, String content, AuthorRef authorRef) {
        this.title = title;
        this.content = content;
        this.authorRef = authorRef;
    }

    public Article(String title, String content, Author author) {
        this.title = title;
        this.content = content;
        this.authorRef = new AuthorRef(author.getId());
    }

    public void addComments(Comment comment) {
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        comments.remove(comment);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public AuthorRef getAuthorRef() {
        return authorRef;
    }

    public void setAuthorRef(AuthorRef authorRef) {
        this.authorRef = authorRef;
    }
}

