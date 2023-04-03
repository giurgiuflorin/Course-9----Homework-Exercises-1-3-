package Exercise3;

import java.util.ArrayList;

public class Person {

    private String name;
    private int age;
    private String position;

    public Person(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public static Person getManager(ArrayList<Person> array, String position) {
        for (Person p : array) {
            if (p.position.equals(position)) {
                System.out.println(p.getName());
                return p;
            }
        }
        return null;
    }

    public static ArrayList<Person> getPersons(ArrayList<Person> array, String position) {

        ArrayList<Person> getPersons = new ArrayList<>();
        for (Person p : array) {
            if (p.position.equals(position)) {
                getPersons.add(p);
            }
        }
        for (Person p : getPersons) {
            System.out.println(p.getName());
        }
        return getPersons;
    }

    public static ArrayList<Person> getPersonsOlder(ArrayList<Person> array, int age) {
        ArrayList<Person> getPersons = new ArrayList<>();
        for (Person p : array) {
            if (p.getAge() > age) {
                getPersons.add(p);
            }
        }
        for (Person p : getPersons) {
            System.out.println(p.getName() + " " + p.getAge());
        }
        return getPersons;
    }

    public static ArrayList<Person> getPersonName(ArrayList<Person> array, String requiredName) {
        ArrayList<Person> getPersons = new ArrayList<>();
        for (Person p : array) {
            if (p.getName() == requiredName) {
                getPersons.add(p);
            }
        }
        for (Person p : getPersons) {
            System.out.println(p.getName() + " " + p.getPosition() + " " + p.getAge());
        }
        return getPersons;
    }

    public static void employ(ArrayList<Person> array, Person pers) {
        array.add(pers);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

}
