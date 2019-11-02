;(function () {
  const path = require('path')

  config.entry = path.resolve(__dirname, '../app-minified/dce-test-dce-app.js')

  config.output.filename = 'app.js'

  config.resolve.modules.unshift(
    path.resolve(__dirname, '../app-minified')
  )

  config.mode = 'production'
})()