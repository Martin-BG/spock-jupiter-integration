package spock

import spock.lang.Specification

class SpockTwoIS extends Specification {

    public static final int SLEEP_MILLISECONDS = 200

    def 'demo spec'() {
        given:
        sleep(SLEEP_MILLISECONDS)
        expect:
        true
    }

    def 'demo spec two'() {
        given:
        sleep(SLEEP_MILLISECONDS)
        expect:
        true
    }

    def 'demo spec three'() {
        given:
        sleep(SLEEP_MILLISECONDS)
        expect:
        true
    }

    def 'demo spec four'() {
        given:
        sleep(SLEEP_MILLISECONDS)
        expect:
        true
    }

    def 'demo spec five'() {
        given:
        sleep(SLEEP_MILLISECONDS)
        expect:
        true
    }
}
