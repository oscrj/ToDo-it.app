package se.lexicon.oscar.data;

import org.junit.Assert;
import org.junit.Test;

public class TodoSequencerTest {

    @Test
    public void chech_if_todoId_increase_by_one(){
        int actual = TodoSequencer.nextTodoId();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_if_todoId_is_reset(){
        int actual = TodoSequencer.reset();
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
