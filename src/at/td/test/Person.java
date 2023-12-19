package at.td.test;

public class Person {

    private String firstname, lastname;

    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void printName(){
        System.out.println(firstname + " " + lastname);
    }
}
