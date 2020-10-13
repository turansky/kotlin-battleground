@JsExport
@ExperimentalJsExport
class DataDelegate(source: IData) : IData by source {
    var zz: Int = 42
    var zzz: Int by ::zz
}
