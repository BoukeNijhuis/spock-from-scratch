import spock.lang.Specification

class DatapipesTest extends Specification {

    def "datapipes test"() {
        expect:
        Math.min(a, b) == result

        where:
        a << [1, 4, 1]
        b << [3, 2, 1]
        result << [1, 2, 1]
    }
}
