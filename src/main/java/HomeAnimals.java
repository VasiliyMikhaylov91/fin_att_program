public abstract class HomeAnimals extends Animals{
    private String sort;

    HomeAnimals(String name, String birthDate) {
        super(name, birthDate);
        sort = "HomeAnimal";
    }

    String getSort() {
        return sort;
    }

}
