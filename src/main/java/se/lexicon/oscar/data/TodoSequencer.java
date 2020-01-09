package se.lexicon.oscar.data;

public class TodoSequencer {

    private static int todoId;

    public static int nextTodoId(){
        return ++todoId;
    }

    public static void reset(){
        todoId = 0;
    }
}
