public class Camel extends MountAnimals implements View{
    private String kind;

    Camel(String name, String birthDate) {
        super(name, birthDate);
        kind = "Camel";
    }

    public void getInfo() {
        System.out.println(String.format("name: %s", getName()));
        System.out.println(String.format("sort: %s", getSort()));
        System.out.println(String.format("kind: %s", kind));
        getCommands();
        System.out.println(String.format("BirthDate: %s", getBirthDate()));
    }
}
