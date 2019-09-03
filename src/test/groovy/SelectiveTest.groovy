import spock.lang.Specification

class SelectiveTest extends Specification {

    def "first test"() {
        expect:
        true != false
    }

    def "not a test when there is no block"() {
        println "not a test"
    }
}
