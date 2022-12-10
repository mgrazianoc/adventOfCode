package lib

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Part1KtTest {

    @Test
    fun part1() {
        val input = this::class.java.getResourceAsStream("/input.txt")?.bufferedReader()?.readText()

        input?.let {
            val output = part1(it)
            assertEquals(output, 2)
        }
    }
}