package Desafio.entities;

public class Task extends Lesson{
    private String description;
    private Integer questionCount;

    public Task() {
        super();
    }

    public Task(String tittle, String description, Integer questionCount) {
        super(tittle);
        this.description = description;
        this.questionCount = questionCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuestionCount() {
        return questionCount;
    }

    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    @Override
    public int duration() {
        return ((questionCount * 5) * 60);
    }
}
