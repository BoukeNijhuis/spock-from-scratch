import spock.lang.Specification

class MockTest extends Specification {

    void "mock test"() {
        List mockList = Mock()
        mockList.size() >> 1
        expect:
        mockList.size() == 1
    }
}
