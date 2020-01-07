package se.lexicon.oscar.data;

import se.lexicon.oscar.model.Person;

import java.util.Arrays;

public class People {

    private static Person [] personArray = new Person[0];

    public static int size(){
        return personArray.length;
    }

    public static Person[] findAll(){
        return personArray;
    }

    public static Person findById(int personId){
        for(int i = 0; i < personArray.length; i++){
            if(personArray[i].getPersonId() == personId){
                return personArray[i];
            }
        }
        return null;
    }

    public static Person createPerson(String firstName, String lastName){
        Person newPerson = new Person(PersonSequencer.nextPersonId(), firstName, lastName);
        personArray = addToPersonArray(personArray, newPerson);
        return newPerson;
    }

    public static Person[] addToPersonArray(Person[] personArray, Person person){
        int offset = personArray.length;
        Person[] tempArray = Arrays.copyOf(personArray, offset + 1);

        for(int i = offset; i < offset+1; i++){
            tempArray[i] = person;
        }
        return tempArray;
    }

    public static void clear(){
        Person[] clearArray = new Person[0];
        personArray = clearArray;
    }

}
