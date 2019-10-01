import spock.lang.Ignore
import spock.lang.Specification

@Ignore
class ArgumentConstraintsTest extends Specification {

    void "voidault mock test"() {
        List listMock = Mock();

        when:
        listMock.add("abc")

        then:
        1 * listMock.add()
        1 * listMock.add(_)
        1 * listMock.add(*_)
        1 * listMock.add(!null)
        1 * listMock.add(_ as String)
        1 * listMock.add("abc")

    }
}
