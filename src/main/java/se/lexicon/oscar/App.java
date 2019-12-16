package se.lexicon.oscar;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import se.lexicon.oscar.model.Person;

import java.sql.SQLOutput;

public class App
{
    public static void main( String[] args ){

        Person firstPerson = new Person(1,"John","Doe");
        System.out.println();
    }
}
