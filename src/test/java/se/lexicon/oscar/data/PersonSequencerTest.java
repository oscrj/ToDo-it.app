package se.lexicon.oscar.data;

import org.junit.Assert;
import org.junit.Test;

public class PersonSequencerTest {

    private static int personIdTest;

    @Test
    public void chech_if_personalId_increase_by_one(){
        PersonSequencer.nextPersonId(personIdTest);
        int expected = 1;

        Assert.assertEquals(expected, PersonSequencer.nextPersonId(personIdTest));
    }

    @Test
    public void test_if_personId_is_reset(){
        PersonSequencer.reset(personIdTest);
        int expected = 0;

        Assert.assertEquals(expected, PersonSequencer.reset(personIdTest));
    }
}
