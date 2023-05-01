import java.util.ArrayList;

public abstract class Animals {
    private String name;
    private ArrayList<String> commands;
    private String birthDate;
    private String kind;

    Animals (String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        commands = new ArrayList<>();
    }

    void learnNewCommand (String newCommand) {
        commands.add(newCommand);
    }

    void getCommands() {
        System.out.println("Commands: ");
        for (String command: commands) {
            System.out.println(String.format("  %s", command));
        }
    }

    String getName() {
        return name;
    }

    String getBirthDate() {
        return birthDate;
    }
}
