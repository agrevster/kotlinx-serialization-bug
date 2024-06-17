# Kotlinx Serialization Bug

## BUG FIXED in Kotlin 2.0!

While attempting to upgrade one of my projects from Kotlin 1.8.0 to 1.9.10, I encountered a compiler error with serializing generic classes with a field that uses generics.

This repo contains two gradle projects that contain the exact same code. The only difference is the Kotlin version.

Running `./gradlew check` in 1.8.0 returns no error, while running the same code in the 1.9.10 project leads to a compiler error.


#### Note
*This project is not using the latest version of kotlinx-serialization because it is not compatible with Kotlin 1.8.0. The error still occurs in the latest version.*

---
Box.kt
```kotlin
@Serializable
open class Box<E> {
    val contents: Map<String, E>? = null
}
```
---
Test.kt
```kotlin
@Serializable
data class TestData(val field: String)


@Serializable
class TestClass(): Box<TestData>()

@Test
fun test(){

}
```