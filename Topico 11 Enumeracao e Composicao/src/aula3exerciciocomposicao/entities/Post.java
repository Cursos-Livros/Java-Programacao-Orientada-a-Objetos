package aula3exerciciocomposicao.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Post {
    private LocalDate moment;
    private String tittle;
    private String content;
    private Integer likes;

    List<Comment> comments = new ArrayList<Comment>();

    public Post(LocalDate moment, String tittle, String content, Integer likes) {
        this.moment = moment;
        this.tittle = tittle;
        this.content = content;
        this.likes = likes;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    // Coleções evite set, utilize add e remove
    public void addComments(Comment comment) {
        comments.add(comment);
    }

    public void removeComments(Comment comment) {
        comments.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tittle + "\nn");
        stringBuilder.append(likes + "Likes -");
        stringBuilder.append(moment + "\n");
        stringBuilder.append(content + "\n");
        stringBuilder.append("Comments:\n");
        for (Comment comment : comments) {
            stringBuilder.append(comment.getText());
        }
        return stringBuilder.toString();
    }
}
