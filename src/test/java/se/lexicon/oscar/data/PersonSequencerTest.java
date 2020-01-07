package se.lexicon.oscar.data;

import org.junit.Assert;
import org.junit.Test;

public class PersonSequencerTest {

    @Test
    public void chech_if_personalId_increase_by_one(){
        int actual = PersonSequencer.nextPersonId();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_if_personId_is_reset(){
        int actual = PersonSequencer.reset();
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}
