import spock.lang.Specification

class ExceptionTest extends Specification {

    def "exception test"() {

        when:
        String s;
        s.size()

        then:
        thrown(NullPointerException)

    }
}
