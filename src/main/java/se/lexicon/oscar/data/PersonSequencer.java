package se.lexicon.oscar.data;

public class PersonSequencer {

    private static int personId;

    public static int nextPersonId(){
        personId++;
        return personId;
    }

    public static int reset(){
        personId = 0;
        return personId;
    }
}
