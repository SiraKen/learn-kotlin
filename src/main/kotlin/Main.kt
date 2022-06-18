fun main(args: Array<String>) {
    if (args.isNotEmpty()) {
        println(String.format("Hello world from %s", args[0]))
    } else {
        println("There are no arguments.")
    }
}

/**
 * This is the first function I made :)
 */
fun calc(numA: Int, numB: Int, type: String): Int {
    return when (type) {
        "add" -> numA + numB
        "sub" -> numA - numB
        "mul" -> numA * numB
        "div" -> numA / numB
        else -> 0
    }
}