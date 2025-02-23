# Setting the Code Runner

### Setting in Windows
  Add the Follow Line in Code runner Setting File

```json
    "csharp":"csc $fileName && $fileNameWithoutExt",
```


### Setting in Linux
  Add the Follow Line in Code runner Setting File

```json
    "csharp":"cd $dir && mono-csc $fileName && mono $fileNameWithoutExt.exe",
```