import spock.lang.Specification

class SelectiveTest extends Specification {

    void "first test"() {
        expect:
        true != false
    }

    void "not a test when there is no block"() {
        println "not a test"
    }
}
