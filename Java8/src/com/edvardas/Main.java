package com.edvardas;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal sheep = new Sheep();
        Animal cow = new Cow();
        Animal chicken = new Chicken();

        System.out.println(
                "\nThe cat goes " + cat +
                "\nThe dog goes " + dog +
                "\nThe sheep goes " + sheep +
                "\nThe cow goes " + cow +
                "\nThe chicken goes " + chicken
        );

        Animal[] arr = {cat, dog, sheep, cow, chicken};
        Farm farm = new Farm("Animal farm", arr);
        System.out.println(
                "\nFarm " + farm.getName() + " has " + farm.getArr().length + " animals"
        );

        System.out.println(farm.toString());
    }
}
