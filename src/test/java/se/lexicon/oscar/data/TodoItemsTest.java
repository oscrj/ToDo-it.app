package se.lexicon.oscar.data;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.oscar.model.Todo;

public class TodoItemsTest {

    private Todo toDoListTest;

    @Before
    public void setUp(){
        toDoListTest = TodoItems.createTodo("Walk the dog");
    }

    @Test
    public void is_todo_created(){
        int expectedId = 1;
        String expectedDescription = "Walk the dog";

        Assert.assertEquals(expectedDescription, toDoListTest.getDescription());
        Assert.assertEquals(expectedId, toDoListTest.getTodoId());
    }

    @Test
    public void is_todo_added_to_array(){
        int actual = TodoItems.size();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void find_all_todos_on_array(){
        Todo[] test = TodoItems.findAll();
        int expected = 1;

        Assert.assertEquals(expected, test.length);
    }

    @Test
    public void find_person_by_id(){
        int testId = 1;
        Todo result = TodoItems.findById(testId);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.getTodoId());
    }

    @Test
    public void is_array_cleared(){
        int expected = 0;
        TodoItems.clear();

        Assert.assertEquals(expected, TodoItems.size());
    }

    @After
    public void clear_todo_array(){
        TodoSequencer.reset();
        TodoItems.clear();
    }
}
