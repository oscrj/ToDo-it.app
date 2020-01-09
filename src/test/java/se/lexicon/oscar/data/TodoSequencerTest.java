package se.lexicon.oscar.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TodoSequencerTest {

    @Before
    public void setUp(){
        TodoSequencer.reset();
    }
    @Test
    public void check_if_todoId_increase_by_one(){
        int actual = TodoSequencer.nextTodoId();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }
}
