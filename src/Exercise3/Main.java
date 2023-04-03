package Exercise3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Person> company = new ArrayList<>();
        company.add(new Person("Simion", 23, "welder"));
        company.add(new Person("Damian", 44, "manager"));
        company.add(new Person("Flavius", 44, "manager"));
        company.add(new Person("Alex", 33, "carpenter"));
        company.add(new Person("Florin", 22, "carpenter"));
        company.add(new Person("Samuel", 40, "plumber"));
        company.add(new Person("Darius", 19, "plumber"));
        company.add(new Person("Darius", 21, "plumber"));

        //getManager(): Person - checks all persons and returns the one with position "manager"
        Person manager = Person.getManager(company, "manager");

        //getPersons(String profession):List<Person> - returns all the persons that have the received proffesion
       ArrayList<Person> samePosition = Person.getPersons(company, "plumber");

       //getPersonsOlder(int age): List<Person> - returns all the persons that are older than received age
        ArrayList<Person> olderThan = Person.getPersonsOlder(company, 30);

        //getPerson(String filterName):List<Person> - returns all the persons that have names that contains the received string
        ArrayList<Person> containsName = Person.getPersonName(company, "Darius");

        //employ(Person) - employs a person. Adds it to the list of persons
        Person newP = new Person("Mihaela", 25, "plumber");
        newP.employ(company, newP);

        }
    }

