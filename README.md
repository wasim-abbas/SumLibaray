>To get a Git project into your build:

>Step 1. Add the JitPack repository to your build file
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
  >Step 2. Add the dependency
  
  ```
  dependencies {
	        implementation 'com.github.wasim-abbas:SumLibaray:Tag'
	}
  
  ```


