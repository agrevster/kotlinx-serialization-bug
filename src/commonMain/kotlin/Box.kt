import kotlinx.serialization.Serializable

@Serializable
open class Box<E> {
    val contents: Map<String, E>? = null
}