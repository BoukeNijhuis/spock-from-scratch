import spock.lang.Specification

class MockTest extends Specification {

    def "mock test"() {
        List mockList = Mock()
        mockList.size() >> 1
        expect:
        mockList.size() == 1
    }
}
