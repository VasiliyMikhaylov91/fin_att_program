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
                break;
            case 2:
                animalsArrayList.add(new Cat(name, String.format("%s-%s-%s", day, month, year)));
                break;
            case 3:
                animalsArrayList.add(new Hamster(name, String.format("%s-%s-%s", day, month, year)));
                break;
            case 4:
                animalsArrayList.add(new Horse(name, String.format("%s-%s-%s", day, month, year)));
                break;
            case 5:
                animalsArrayList.add(new Camel(name, String.format("%s-%s-%s", day, month, year)));
                break;
            case 6:
                animalsArrayList.add(new Donkey(name, String.format("%s-%s-%s", day, month, year)));
                break;
        }
    }

    void chooseAnimal() {
        int count = 0;
        for (Animals animal : animalsArrayList) {
            System.out.println(String.format("%d - %s", ++count, animal.getName()));
        }
        System.out.printf("Выберите номер животного: ");
        int anOpt = scInt.nextInt();
        anOpt--;
        workWithAnimal(animalsArrayList.get(anOpt));
    }

    void workWithAnimal(Animals animal) {
        boolean cont = true;
        while (cont) {
            ((View) animal).getInfo();
            System.out.println("1 - Выучить новую команду");
            System.out.println("2 - Закончить работы с животным");
            System.out.printf("Выберите действие: ");
            String learnOpt = scInt.nextLine();
            if ("1".equals(learnOpt)) {
                System.out.printf("Введите название команды: ");
                String command = scInt.nextLine();
                animal.learnNewCommand(command);
            } else if ("2".equals(learnOpt)) {
                cont = false;
            }
        }
    }
}
