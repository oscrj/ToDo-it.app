package se.lexicon.oscar.data;

public class TodoSequencer {

    private static int todoId;

    public static int nextTodoId(){
        todoId++;
        return todoId;
    }

    public static int reset(){
        todoId = 0;
        return todoId;
    }
}
