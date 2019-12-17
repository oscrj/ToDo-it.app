package se.lexicon.oscar.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TodoTest {

    private Todo test;
    @Before
    public void setUp(){
        test = new Todo(2,"Testing");
    }

    @Test
    public void test_to_see_if_todo_was_created(){
        int expectedId = 2;
        String expectedDescription = "Testing";

        Assert.assertEquals(expectedId, test.getTodoId());
        Assert.assertEquals(expectedDescription, test.getDescription());
    }

}
