import spock.lang.Specification

class InteractionTest extends Specification {

    def "default mock test"() {
        List listMock = Mock();

        when:
        listMock.size()

        then:
        1 * listMock.size()
    }
}
