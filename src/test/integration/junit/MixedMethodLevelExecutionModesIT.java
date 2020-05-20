package junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
@DisplayName("JUnit5 Integration test: Mixed method Level ExecutionMode")
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class MixedMethodLevelExecutionModesIT {

    private static final int THREAD_SLEEP_MILLIS = 100;

    @Execution(ExecutionMode.SAME_THREAD)
    @RepeatedTest(5)
    void repeat_method_SAME_THREAD_of_5_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }

    @Execution(ExecutionMode.CONCURRENT)
    @RepeatedTest(500)
    void repeat_method_CONCURRENT_of_500_x_100ms() throws InterruptedException {
        Thread.sleep(THREAD_SLEEP_MILLIS);
    }
}
