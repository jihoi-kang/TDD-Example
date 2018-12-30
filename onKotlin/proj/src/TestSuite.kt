import java.util.ArrayList

class TestSuite(){
    var tests: ArrayList<TestCase> = ArrayList()
    fun add(test: TestCase){
        tests.add(test)
    }
    fun run(result: TestResult): TestResult{
        for (i in 0..(tests.size-1)){
            tests[i].run(result)
        }
        return result
    }
}