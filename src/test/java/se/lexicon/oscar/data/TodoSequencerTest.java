package se.lexicon.oscar.data;

import org.junit.Assert;
import org.junit.Test;

public class TodoSequencerTest {

    private static int personIdTest;

    @Test
    public void chech_if_personalId_increase_by_one(){
        TodoSequencer.nextPersonIdWithNewName(personIdTest);
        int expected = 1;

        Assert.assertEquals(expected, TodoSequencer.nextPersonIdWithNewName(personIdTest));
    }

    @Test
    public void test_if_personId_is_reset(){
        TodoSequencer.resetAgain(personIdTest);
        int expected = 0;

        Assert.assertEquals(expected, TodoSequencer.resetAgain(personIdTest));
    }
}
