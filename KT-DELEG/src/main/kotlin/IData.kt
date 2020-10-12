open external class ClassMetadata {
   val name: String
}

external interface IData {
    val x: Int
    val y: Int

    @Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
    companion object: ClassMetadata {
        val DEFAULT_X: Int
        val DEFAULT_Y: Int
    }
}
