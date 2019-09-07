import spock.lang.Specification

class SimpleDatatableTest extends Specification {

    def "simple datatable test"() {
        expect:
        number % 2 == 1

        where:
        number << [1, 3, 15, Integer.MAX_VALUE ]
    }
}
