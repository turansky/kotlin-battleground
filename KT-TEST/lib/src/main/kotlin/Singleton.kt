object Singleton {
    private var firstCalled: Boolean = false

    fun test(): String {
        if (!firstCalled) {
            firstCalled = true
            return "first"
        }

        return "not first"
    }
}
