open external class ClassMetadata {
   val name: String
}

external interface IData {
    var x: Int
    var y: Int

    val topLeft: IData
    val bottomRight: IData

    @Suppress("NESTED_CLASS_IN_EXTERNAL_INTERFACE")
    companion object : ClassMetadata {
        val DEFAULT_X: Int
        val DEFAULT_Y: Int
    }
}
