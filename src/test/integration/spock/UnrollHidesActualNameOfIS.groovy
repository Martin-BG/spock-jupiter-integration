package spock

import spock.lang.Specification
import spock.lang.Unroll

/*
Notes:
 Parallel method execution doesn't work within a Spec: Spock 1.3 limitation
 @Title and @Narrative annotations are ignored by IntelliJ IDEA
 @Unroll on methods masks actual Spec name on test execution by mvn:
    "Running JUnit Vintage" instead of "Running spock.SomeClassSpec"
*/

class UnrollHidesActualNameOfIS extends Specification {

    private static final int THREAD_SLEEP_MILLISECONDS = 10
    private static final int REPETITIONS = 10

    @Unroll
    def 'method one of #repetitions x #threadSleep ms repeat ##i'() {
        given:
        sleep(THREAD_SLEEP_MILLISECONDS)
        expect:
        true
        where:
        i << (1..REPETITIONS)
        repetitions = REPETITIONS
        threadSleep = THREAD_SLEEP_MILLISECONDS
    }

    @Unroll
    def 'method two of #repetitions x #threadSleep ms repeat ##i'() {
        given:
        sleep(THREAD_SLEEP_MILLISECONDS)
        expect:
        true
        where:
        i << (1..REPETITIONS)
        repetitions = REPETITIONS
        threadSleep = THREAD_SLEEP_MILLISECONDS
    }

    @Unroll
    def 'method three of #repetitions x #threadSleep ms repeat ##i'() {
        given:
        sleep(THREAD_SLEEP_MILLISECONDS)
        expect:
        true
        where:
        i << (1..REPETITIONS)
        repetitions = REPETITIONS
        threadSleep = THREAD_SLEEP_MILLISECONDS
    }

    @Unroll
    def 'method four of #repetitions x #threadSleep ms repeat ##i'() {
        given:
        sleep(THREAD_SLEEP_MILLISECONDS)
        expect:
        true
        where:
        i << (1..REPETITIONS)
        repetitions = REPETITIONS
        threadSleep = THREAD_SLEEP_MILLISECONDS
    }

    @Unroll
    def 'method five of #repetitions x #threadSleep ms repeat ##i'() {
        given:
        sleep(THREAD_SLEEP_MILLISECONDS)
        expect:
        true
        where:
        i << (1..REPETITIONS)
        repetitions = REPETITIONS
        threadSleep = THREAD_SLEEP_MILLISECONDS
    }
}
