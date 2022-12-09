package lib

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Part2KtTest {

    @Test
    fun part2() {
        val input = this::class.java.getResourceAsStream("/input.txt")?.bufferedReader()?.readText()

        input?.let {
            val output = part2(it)
            assertEquals(output, 45000)
        }
    }

}