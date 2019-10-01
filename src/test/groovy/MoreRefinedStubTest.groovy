import spock.lang.Specification

class MoreRefinedStubTest extends Specification {

    void "more refined stub test"() {

        List listMock = Mock();
        listMock.get(_ as Integer) >> {args -> return args.first()}

        expect:
        listMock.get(1) == 1
    }
}
