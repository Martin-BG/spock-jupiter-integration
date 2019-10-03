package demo;

public class Demo {

    public String greeting(String from) {
        switch (from) {
        case "Spock":
            return "Hello from Spock!";
        case "JUnit 5":
            return "Hello from JUnit 5!";
        default:
            throw new IllegalArgumentException("Invalid name " + from);
        }
    }
}
