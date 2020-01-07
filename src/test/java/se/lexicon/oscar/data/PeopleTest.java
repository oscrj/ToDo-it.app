package se.lexicon.oscar.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.lexicon.oscar.model.Person;

public class PeopleTest {

    private Person testPerson;
    private Person testPerson2;

    @Before
    public void setUp(){
        testPerson = People.createPerson("John", "Doe");
        testPerson2 = People.createPerson("Jane", "Doe");
    }

    @Test
    public void is_person_created(){
        int expectedId = 1;
        String expectedName = "John";
        String expectedLastName = "Doe";

        Assert.assertEquals(expectedId, testPerson.getPersonId());
        Assert.assertEquals(expectedName, testPerson.getFirstName());
        Assert.assertEquals(expectedLastName, testPerson.getLastName());
    }

    @Test
    public void is_person_added_to_array(){
        int actual = People.size();
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void find_all_persons_on_array(){
        Person[] testPersons = People.findAll();
        int expected = 2;

        Assert.assertEquals(expected, testPersons.length);
    }

    @Test
    public void find_person_by_id(){
        int testId = 1;
        Person result = People.findById(testId);

        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.getPersonId());
    }

    @Test
    public void is_array_cleared(){
        int expected = 0;
        People.clear();

        Assert.assertEquals(expected, People.size());
    }
}
