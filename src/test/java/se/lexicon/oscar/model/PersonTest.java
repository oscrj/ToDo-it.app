package se.lexicon.oscar.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    private Person testPerson;
    private Person secondTestPerson;

    @Before
    public void setUp(){
        testPerson = new Person(1, "John", "Doe");
        secondTestPerson = new Person(2, "Jane", "Doe");
    }

    @Test
    public void test_if_person_was_created(){
        String expectedName = "John";
        String expectedLastName = "Doe";

        Assert.assertEquals(expectedName, testPerson.getFiresName());
        Assert.assertEquals(expectedLastName, testPerson.getLastName());
        Assert.assertTrue(testPerson.getPersonId() > 0);

        Assert.assertEquals("Jane", secondTestPerson.getFiresName());
        Assert.assertEquals(expectedLastName, secondTestPerson.getLastName());
        Assert.assertTrue(secondTestPerson.getPersonId() > testPerson.getPersonId());
    }
}
