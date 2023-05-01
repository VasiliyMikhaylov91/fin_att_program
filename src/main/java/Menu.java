import javax.imageio.IIOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Animals> animalsArrayList = new ArrayList();
    Scanner scInt = new Scanner(System.in);
    Scanner scStr = new Scanner(System.in);

    public void process() {
        boolean cont = true;
        while (cont) {
            System.out.println("1 - Добавить новое животное");
            System.out.println("2 - Посмотреть животных");
            System.out.println("3 - Выход");
            System.out.printf("Введите действие: ");
            int opt = scInt.nextInt();
            switch (opt) {
                case 1:
                    addAnimal();
                    break;
                case 2:
                    chooseAnimal();
                    break;
                case 3:
                    cont = false;
                    break;
            }
        }
    }

    private void addAnimal() {
        System.out.printf("Введите имя животного: ");
        String name = scStr.nextLine();
        System.out.println("Выберите вид животного: ");
        System.out.println("1 - Собака");
        System.out.println("2 - Кошка");
        System.out.println("3 - Хомяк");
        System.out.println("4 - Лошадь");
        System.out.println("5 - Верблюд");
        System.out.println("6 - Осёл");
        System.out.printf("Выбор: ");
        int kindOpt = scInt.nextInt();
        System.out.printf("Введите год рождения животного: ");
        String year = scStr.nextLine();
        System.out.printf("Введите месяц рождения животного: ");
        String month = scStr.nextLine();
        System.out.printf("Введите день рождения животного: ");
        String day = scStr.nextLine();
        switch (kindOpt) {
            case 1:
                animalsArrayList.add(new Dog(name, String.format("%s-%s-%s", day, month, year)));
            case 2:
                animalsArrayList.add(new Cat(name, String.format("%s-%s-%s", day, month, year)));
            case 3:
                animalsArrayList.add(new Hamster(name, String.format("%s-%s-%s", day, month, year)));
            case 4:
                animalsArrayList.add(new Horse(name, String.format("%s-%s-%s", day, month, year)));
            case 5:
                animalsArrayList.add(new Camel(name, String.format("%s-%s-%s", day, month, year)));
            case 6:
                animalsArrayList.add(new Donkey(name, String.format("%s-%s-%s", day, month, year)));
        }
    }

    void chooseAnimal() {
        int count = 0;
        for (Animals animal: animalsArrayList) {
            System.out.println(String.format("%d - %s", ++count, animal.getName()));
        }
        System.out.printf("Выберите номер животного");
        int anOpt = scInt.nextInt();
        anOpt--;
        Object animal = animalsArrayList.get(anOpt);
        try {
            Dog dog = (Dog) animal;
            dog.getInfo();
        } catch (Exception e)  {
            try {
                Cat cat = (Cat) animal;
                cat.getInfo();
            } catch (Exception e1) {
                try {
                    Hamster hamster = (Hamster) animal;
                    hamster.getInfo();
                } catch (Exception e2) {
                    try {
                        Horse horse = (Horse) animal;
                        horse.getInfo();
                    } catch (Exception e3) {
                        try {
                            Camel camel = (Camel) animal;
                            camel.getInfo();
                        } catch (Exception e4) {
                            try {
                                Donkey donkey = (Donkey) animal;
                                donkey.getInfo();
                            } catch (Exception e5) {
                                System.out.println("Животное не определено");
                            }
                        }
                    }
                }
            }
        }
//        if (animal == Dog.class) {
//            Dog dog = (Dog) animal;
//            dog.getInfo();
//        } else if (animal == Cat.class) {
//            Cat cat = (Cat) animal;
//            cat.getInfo();
//        } else if (animal == Hamster.class) {
//            Hamster hamster = (Hamster) animal;
//            hamster.getInfo();
//        } else if (animal == Horse.class) {
//            Horse horse = (Horse) animal;
//            horse.getInfo();
//        } else if (animal == Camel.class) {
//            Camel camel = (Camel) animal;
//            camel.getInfo();
//        } else if (animal == Donkey.class) {
//            Donkey donkey = (Donkey) animal;
//            donkey.getInfo();
//        } else {
//            System.out.println("Животное не определено");
//        }
    }

}
