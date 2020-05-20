package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("JUnit5 Integration test: Class Level ExecutionMode.CONCURRENT")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class ClassLevelExecutionModeConcurrentIT {

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
