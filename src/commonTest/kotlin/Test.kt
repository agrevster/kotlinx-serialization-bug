import kotlinx.serialization.Serializable
import kotlin.test.Test

class Test {

    @Serializable
    data class TestData(val field: String)


    @Serializable
    class TestClass(): Box<TestData>()

    @Test
    fun test(){

    }

}