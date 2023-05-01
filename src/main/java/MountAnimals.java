public abstract class MountAnimals extends Animals{
    private String sort;

    MountAnimals(String name, String birthDate) {
        super(name, birthDate);
        sort = "MountAnimal";
    }

    String getSort() {
        return sort;
    }
}
