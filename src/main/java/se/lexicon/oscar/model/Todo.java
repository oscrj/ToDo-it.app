package se.lexicon.oscar.model;

public class Todo {

    private final int todoId;
    private String description;
    private boolean done;
    Person assignee;

    public Todo(int todoId, String description) {
        this.todoId = todoId;
        this.description = description;
    }

    public int getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
