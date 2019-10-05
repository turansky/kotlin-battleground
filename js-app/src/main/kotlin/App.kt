import org.kodein.di.Kodein
import org.kodein.di.erased.instance

private val kodein by lazy {
    Kodein {
        import(commonModule())
    }
}

fun inc(num: Int): Int {
    val math: Math by kodein.instance()
    return math.inc(num)
}