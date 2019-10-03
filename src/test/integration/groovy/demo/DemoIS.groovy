package demo

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title
import spock.lang.Unroll

@Unroll
@Title('Spock Unit Test of demo.Demo.java')
class DemoIS extends Specification {

    @Subject
    Demo demo

    def setup() {
        demo = new Demo()
    }

    def 'greeting with "#from" is "#greeting"'() {
        expect:
        demo.greeting(from) == greeting

        where:
        from      | greeting
        'Spock'   | 'Hello from Spock!'
        'JUnit 5' | 'Hello from JUnit 5!'
    }

    def 'greeting with "#invalidName" throws IllegalArgumentException'() {
        when:
        demo.greeting(invalidName)

        then:
        IllegalArgumentException ex = thrown()
        ex.message == 'Invalid name ' + invalidName

        where:
        invalidName << ['spock', 'jUnit 5', '', 'random', ' ', '1', '!']
    }

    def 'greeting with "null" throws NullPointerException'() {
        when:
        demo.greeting(null)

        then:
        thrown NullPointerException
    }
}
