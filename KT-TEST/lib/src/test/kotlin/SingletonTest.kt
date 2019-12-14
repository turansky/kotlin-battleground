import kotlin.test.Test
import kotlin.test.assertEquals

class SingletonTest {
    @Test
    fun test() {
        assertEquals("first", Singleton.test())
        assertEquals("not first", Singleton.test())
        assertEquals("not first", Singleton.test())
    }
}
