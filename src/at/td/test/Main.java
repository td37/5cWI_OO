package at.td.test;

public class Main {
    public static void main(String[] args) {
        PetStore petStore = new PetStore();

        Person p1 = new Person("Anna", "von Arendelle");
        Person p2 = new Person("Sven", "Bjorgman");

        Cat c1 = new Cat("Heidi");
        Dog d1 = new Dog("Peter");

        petStore.addAnimal(c1);
        petStore.addAnimal(d1);

        c1.run();
        d1.run();

        petStore.printNameOfAnimals();

        p1.printName();
    }
}
