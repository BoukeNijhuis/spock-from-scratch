import spock.lang.Specification

class SpecificationAsDocumentationTest extends Specification {

    void "specification as documentation test"() {
        given: "an empty bank account"
        // ...

        when:
        "the account is credited one euro"
        // ...

        then:
        "the account's balance is one euro"
        // ...
    }
}
