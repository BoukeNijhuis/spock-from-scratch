import spock.lang.Specification

class ComplexDatatableWithLayoutTest extends Specification {

    void "complex datatable test"() {
        expect:
        Math.min(a, b) == result
        where:
        a                 | b || result
        1                 | 2 || 1
        3                 | 2 || 2
        Integer.MIN_VALUE | 1 || Integer.MIN_VALUE
    }
}
