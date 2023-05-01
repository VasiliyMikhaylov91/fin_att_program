public class Donkey extends MountAnimals{
    private String kind;

    Donkey(String name, String birthDate) {
        super(name, birthDate);
        kind = "Donkey";
    }

    void getInfo() {
        System.out.println(String.format("name: %s", getName()));
        System.out.println(String.format("sort: %s", getSort()));
        System.out.println(String.format("kind: %s", kind));
        getCommands();
        System.out.println(String.format("BirthDate: %s", getBirthDate()));
    }
}
