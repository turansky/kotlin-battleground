import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.provider

fun commonModule() = Kodein.Module(
    name = "common",
    prefix = "mpp-lib"
) {
    bind<Math>() with provider { MathImpl() }
}