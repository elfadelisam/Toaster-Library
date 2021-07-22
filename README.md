# Toaster Library
A simple library to show Toast

## Prerequisites

> Step 1. Add the JitPack repository to your build file 
Add it in your root build.gradle file (not your module build.gradle file) at the end of repositories:

***gradle
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
	}
}
***
## Dependency
  
 > Step 2. Add the dependency
 > Add this to your module's build.gradle file (make sure the version matches the JitPack badge above):
 
***gradle 
dependencies {
	implementation 'com.github.elfadelisam:Toaster-Library:1.0'
}
***

