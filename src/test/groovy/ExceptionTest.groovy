import spock.lang.Specification

class ExceptionTest extends Specification {

    void "exception test"() {
        when:
        String s = null
        s.length()
        then:
        thrown(NullPointerException)
    }
}
