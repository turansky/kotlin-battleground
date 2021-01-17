import org.w3c.dom.mediasource.CLOSED
import org.w3c.dom.mediasource.ENDED
import org.w3c.dom.mediasource.OPEN
import org.w3c.dom.mediasource.ReadyState
import kotlin.test.Test
import kotlin.test.assertEquals

class ReadyStateTest {
    @Test
    fun companionMethods() {
        assertEquals("closed", ReadyState.CLOSED)
        assertEquals("open", ReadyState.OPEN)
        assertEquals("ended", ReadyState.ENDED)
    }
}
