import spock.lang.Specification

class FailingDatatableTest extends Specification {

    // this test has to fail to show the error message
    def "failing datatable test"() {
        expect:
        Math.min(a, b) == result

        where:
        a | b || result
        1 | 3 || 1
        4 | 2 || 4
        1 | 1 || 1
    }
}
