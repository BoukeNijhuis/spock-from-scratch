import spock.lang.Specification

class BlockTest extends Specification {

    void "block test"() {
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
