# Test example for [KT-34751](https://youtrack.jetbrains.com/issue/KT-34751)

#### Build
```
./gradlew build
```

#### DCE check
* Before DCE - `build/js/packages/dce-yfiles-base/kotlin/dce-yfiles-base.js` 
* After DCE - `build/js/packages/app-minified/dce-yfiles-base.js`