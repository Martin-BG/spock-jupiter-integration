package demo;

public class Demo {

    public String greeting(String from) {
        return switch (from) {
            case "Spock" -> "Hello from Spock!";
            case "JUnit 5" -> "Hello from JUnit 5!";
            default -> throw new IllegalArgumentException("Invalid name " + from);
        };
    }
}
