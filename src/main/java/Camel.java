public class Camel extends MountAnimals{
    private String kind;

    Camel(String name, String birthDate) {
        super(name, birthDate);
        kind = "Camel";
    }

    void getInfo() {
        System.out.println(String.format("name: %s", getName()));
        System.out.println(String.format("sort: %s", getSort()));
        System.out.println(String.format("kind: %s", kind));
        getCommands();
        System.out.println(String.format("BirthDate: %s", getBirthDate()));
    }
}
