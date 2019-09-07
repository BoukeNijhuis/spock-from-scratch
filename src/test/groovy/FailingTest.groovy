import spock.lang.Specification

class FailingTest extends Specification {

    // this test has to fail to show the error message
    def "failing test"() {
        expect:
        Math.min(a, b) == result

        where:
        a | b || result
        4 | 2 || 4
    }
}
