import spock.lang.Specification

class BlockTest extends Specification {

    def "block test"() {
        given:
        String string = "abc"

        when:
        int length = string.length()

        then:
        length == 3

        cleanup:
        string = null
    }
}
