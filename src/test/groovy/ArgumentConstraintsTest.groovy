import org.junit.Ignore
import spock.lang.Specification

@spock.lang.Ignore
class ArgumentConstraintsTest extends Specification {

    def "default mock test"() {
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
