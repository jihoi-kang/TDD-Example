class TestResult(){
    var runCount: Int = 0
    var failureCount: Int = 0

    fun testStarted(){
        runCount += 1
    }
    fun testFailed(){
        failureCount += 1
    }

    fun summary(): String{
        return "$runCount run, $failureCount failed"
    }
}