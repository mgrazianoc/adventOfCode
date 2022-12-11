import lib.part1
import lib.part2

fun main() {
    val input1 = object {}.javaClass.getResourceAsStream("/input.txt")?.bufferedReader()?.readText()
    input1?.let {
        println(part1(it))
    }

    val input2 = object {}.javaClass.getResourceAsStream("/input.txt")?.bufferedReader()?.readText()
    input2?.let {
        println(part2(it))
    }
}