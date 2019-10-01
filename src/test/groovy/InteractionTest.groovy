import spock.lang.Specification

class InteractionTest extends Specification {

    void "interaction test"() {
        List listMock = Mock()
        when:
        listMock.size()
        then:
        1 * listMock.size()
    }
}
