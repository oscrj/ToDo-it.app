package se.lexicon.oscar.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.oscar.model.Todo;

public class TodoItemsTest {

    private Todo toDoListTest;
    private Todo toDoListTest2;

    @Before
    public void setUp(){
        toDoListTest = TodoItems.createDescription("Walk the dog");
        toDoListTest2 = TodoItems.createDescription("Brush your teeth");
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
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void find_all_todos_on_array(){
        Todo[] test = TodoItems.findAll();
        int expected = 2;

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
}
