import java.lang.Exception

open class TestCase(private val name: String){
    open fun setUp() {}
    fun run(result: TestResult){
        result.testStarted()
        setUp()

        try {
            val method = javaClass.getMethod(this.name)
            method.invoke(this)
        } catch(e: Exception) {
            result.testFailed()
        }

        tearDown()
    }
    open fun tearDown() {}
}