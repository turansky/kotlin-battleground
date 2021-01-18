import org.w3c.dom.NodeFilter
import kotlin.test.Test
import kotlin.test.assertEquals

class NodeFilterTest {
    @Test
    fun companionMethods() {
        assertEquals(1, NodeFilter.FILTER_ACCEPT)
    }
}
