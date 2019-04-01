import spock.lang.Specification

class DefaultMockTest extends Specification {

    def "default mock test"() {
        List listMock = Mock();

        expect:
        listMock.size() == 0
    }
}
