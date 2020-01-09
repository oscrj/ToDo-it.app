package se.lexicon.oscar.model;

public class Todo {

    private final int todoId;
    private String description;
    private boolean done;
    Person assignee;

    public Todo(int todoId, String description) {
        this.todoId = todoId;
        setDescription(description);
        setDone(false);
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

    //  done = true.
    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee(){
        return assignee;
    }

    public void setAssignee(Person assignee){
        this.assignee = assignee;
    }
}
