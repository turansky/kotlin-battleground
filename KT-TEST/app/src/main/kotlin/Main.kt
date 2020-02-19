object Main {
    fun make() {
        println(Singleton.test())
        println(require("icon.svg"))
    }
}

external fun require(path: String): String
