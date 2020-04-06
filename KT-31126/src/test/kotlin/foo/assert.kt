package foo

fun <T> assertEquals(expected: T, actual: T) {
    kotlin.test.assertEquals(expected, actual)
}
