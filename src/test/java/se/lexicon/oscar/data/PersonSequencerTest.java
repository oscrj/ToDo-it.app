package se.lexicon.oscar.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonSequencerTest {

    @Before
    public void setUp(){
        PersonSequencer.reset();
    }

    @Test
    public void chech_if_personalId_increase_by_one(){
        int actual = PersonSequencer.nextPersonId();
        int expected = 1;

        Assert.assertEquals(expected, actual);
    }
}
