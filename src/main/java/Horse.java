public class Horse extends MountAnimals{
    private String kind = "Horse";

    Horse(String name, String birthDate) {
        super(name, birthDate);
    }

    void getInfo() {
        System.out.println(String.format("name: %s", getName()));
        System.out.println(String.format("sort: %s", getSort()));
        System.out.println(String.format("kind: %s", kind));
        getCommands();
        System.out.println(String.format("BirthDate: %s", getBirthDate()));
    }
}
