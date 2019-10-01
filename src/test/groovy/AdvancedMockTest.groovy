import spock.lang.Specification

class AdvancedMockTest extends Specification {

    void "advanced mock test"() {
        List listMock = Mock()
        1 * listMock.size() >> 2
        expect:
        listMock.size() == 2
    }
}
