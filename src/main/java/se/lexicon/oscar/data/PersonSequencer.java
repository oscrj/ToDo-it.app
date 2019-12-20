package se.lexicon.oscar.data;

public class PersonSequencer {

    private static int personId;

    public static int nextPersonId(int personId){
       personId++;
       return personId;
    }

    public static int reset(int personId){
        personId = 0;
        return personId;
    }
}
