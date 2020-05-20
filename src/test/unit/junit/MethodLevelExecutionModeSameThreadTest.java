package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@DisplayName("JUnit5 Unit test: Method Level ExecutionMode.SAME_THREAD")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MethodLevelExecutionModeSameThreadTest {

    private static final int THREAD_SLEEP_MILLIS = 100;

    @Execution(ExecutionMode.SAME_THREAD)
    @RepeatedTest(5)
    void repeat_method_one_of_5_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }

    @Execution(ExecutionMode.SAME_THREAD)
    @RepeatedTest(5)
    void repeat_method_two_of_5_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }

    @Execution(ExecutionMode.SAME_THREAD)
    @RepeatedTest(5)
    void repeat_method_three_of_5_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }

    @Execution(ExecutionMode.SAME_THREAD)
    @RepeatedTest(5)
    void repeat_method_four_of_5_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }

    @Execution(ExecutionMode.SAME_THREAD)
    @RepeatedTest(5)
    void repeat_method_five_of_5_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }
}
