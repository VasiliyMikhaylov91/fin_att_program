public class Hamster extends HomeAnimals implements View{
    private String kind = "Hamster";

    Hamster(String name, String birthDate) {
        super(name, birthDate);
    }

    public void getInfo() {
        System.out.println(String.format("name: %s", getName()));
        System.out.println(String.format("sort: %s", getSort()));
        System.out.println(String.format("kind: %s", kind));
        getCommands();
        System.out.println(String.format("BirthDate: %s", getBirthDate()));
    }


}
