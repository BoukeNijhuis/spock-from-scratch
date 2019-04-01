import spock.lang.Specification

class CombiningMockStubTest extends Specification {

    def "combining mock stub test"() {

        List listMock = Mock();
        1 * listMock.size() >> 2

        expect:
        def result = listMock.size()
        result == 2
    }
}
