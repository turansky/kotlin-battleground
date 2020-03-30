function DataProvider (data) {
  this._data = data
}

DataProvider.prototype.constructor = DataProvider

Object.defineProperty(
  DataProvider.prototype,
  'data',
  {
    get: function () {
      return this._data
    }
  }
)

export {
  DataProvider
}
