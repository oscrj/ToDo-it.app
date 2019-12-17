package se.lexicon.oscar.model;

public class Person{

    private final int personId;
    private String firesName;
    private String lastName;

    //  Constructor
    public Person(int personId, String firesName, String lastName){
        this.personId = personId;
        this.firesName = firesName;
        this.lastName = lastName;
    }

    //  Getters and Setters
    public int getPersonId() {
        return personId;
    }


    public String getFiresName() {
        return firesName;
    }

    public void setFiresName(String firesName) {
        this.firesName = firesName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
