package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.RepeatedTest;

@DisplayName("JUnit5 Unit test: Use Global ExecutionMode.CONCURRENT")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class GlobalExecutionModeTest {

    private static final int THREAD_SLEEP_MILLIS = 100;

    @RepeatedTest(100)
    void repeat_method_one_of_100_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }

    @RepeatedTest(100)
    void repeat_method_two_of_100_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }

    @RepeatedTest(100)
    void repeat_method_three_of_100_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }

    @RepeatedTest(100)
    void repeat_method_four_of_100_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }

    @RepeatedTest(100)
    void repeat_method_five_of_100_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }
}
