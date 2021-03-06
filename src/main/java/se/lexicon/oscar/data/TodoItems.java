package se.lexicon.oscar.data;

import se.lexicon.oscar.model.Todo;
import java.util.Arrays;

public class TodoItems {

    private static Todo [] todoArray = new Todo[0];

    public static int size(){
        return todoArray.length;
    }

    public static Todo[] findAll(){
        return todoArray;
    }

    public static Todo findById(int todoId){
        for (Todo todo : todoArray) {
            if (todo.getTodoId() == todoId) {
                return todo;
            }
        }
        return null;
    }

    public static Todo createTodo(String description){
        Todo newTodo = new Todo(TodoSequencer.nextTodoId(), description);
        todoArray = addToTodoArray(todoArray, newTodo);
        return newTodo;
    }

    public static Todo[] addToTodoArray(Todo[] todoArray, Todo description){
        int offset = todoArray.length;
        Todo[] tempArray = Arrays.copyOf(todoArray, offset + 1);

        for(int i = offset; i < offset+1; i++){
            tempArray[i] = description;
        }
        return tempArray;
    }

    public static void clear(){
        todoArray = new Todo[0];
    }
}
