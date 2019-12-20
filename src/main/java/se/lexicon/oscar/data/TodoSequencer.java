package se.lexicon.oscar.data;

public class TodoSequencer {

    private static int personId;

    public static int nextPersonIdWithNewName(int personId){
        personId++;
        return personId;
    }

    public static int resetAgain(int personId){
        personId = 0;
        return personId;
    }
}
