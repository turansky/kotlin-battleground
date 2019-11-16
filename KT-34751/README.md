[![CI Status](https://github.com/turansky/kotlin-battleground/workflows/KT-34751/badge.svg)](https://github.com/turansky/kotlin-battleground/actions)

# Test example for [KT-34751](https://youtrack.jetbrains.com/issue/KT-34751)

#### Build
```
./gradlew build
```

#### DCE check
* Before DCE - `build/js/packages/dce-yfiles-base/kotlin/dce-yfiles-base.js` 
* After DCE - `build/js/packages/app-minified/dce-yfiles-base.js`