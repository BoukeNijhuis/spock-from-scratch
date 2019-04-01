import spock.lang.Specification

class DatatableTest extends Specification {

    def "datatable test"() {
        expect:
        Math.min(a, b) == result

        where:
        a | b || result
        1 | 3 || 1
        4 | 2 || 2
        1 | 1 || 1
    }
}
