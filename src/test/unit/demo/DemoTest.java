package demo;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Java Unit Test of demo.Demo.java")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DemoTest {

    private static Demo demo;

    @BeforeAll
    static void init() {
        demo = new Demo();
    }

    @ParameterizedTest(name = "greeting with \"{0}\" is \"Hello from {0}!\"")
    @ValueSource(strings = {"Spock", "JUnit 5"})
    void greeting_with_valid_input_is_correct(String name) {
        String expected = String.format("Hello from %s!", name);

        String actual = demo.greeting(name);

        assertEquals(expected, actual, "Invalid greeting!");
    }

    @ParameterizedTest(name = "greeting with \"{0}\" throws IllegalArgumentException")
    @ValueSource(strings = {"spock", "jUnit 5", "", "random", " ", "1", "!"})
    void greeting_with_invalid_input_throws_IllegalArgumentException(String name) {
        assertThrows(IllegalArgumentException.class, () -> demo.greeting(name), "Invalid name " + name);
    }

    @Test
    void greeting_with_null_throws_NullPointerException() {
        assertThrows(NullPointerException.class, () -> demo.greeting(null),
                "NullPointerException should be thrown on null input");
    }
}
