import spock.lang.Specification

class StubTest extends Specification {

    def "stub test"() {
        List listMock = Mock();
        listMock.size() >> 1

        expect:
        listMock.size() == 1
    }
}
