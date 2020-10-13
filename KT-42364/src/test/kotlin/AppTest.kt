import Object.Companion.getOwnPropertyDescriptor
import kotlin.test.Test
import kotlin.test.assertTrue

class DataDelegateTest {
    @Test
    fun configurableProperties() {
        val jsClassPrototype: Any = DataDelegate::class.js.asDynamic().prototype

        assertTrue("x") {
            getOwnPropertyDescriptor(jsClassPrototype, "x").configurable
        }

        assertTrue("y") {
            getOwnPropertyDescriptor(jsClassPrototype, "y").configurable
        }

        assertTrue("topLeft") {
            getOwnPropertyDescriptor(jsClassPrototype, "topLeft").configurable
        }

        assertTrue("bottomRight") {
            getOwnPropertyDescriptor(jsClassPrototype, "bottomRight").configurable
        }

        assertTrue("zzz") {
            getOwnPropertyDescriptor(jsClassPrototype, "zzz").configurable
        }
    }
}


