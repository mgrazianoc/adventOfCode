package lib

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Part2KtTest {

    private val input = this::class.java.getResourceAsStream("/input.txt")?.bufferedReader()?.readText()

    @Test
    fun part2_1() {
        val data = input?.split("\n")?.get(0)

        data?.let {
            val output = part2(it)
            assertEquals(output, 19)
        }
    }

    @Test
    fun part2_2() {
        val data = input?.split("\n")?.get(1)

        data?.let {
            val output = part2(it)
            assertEquals(output, 23)
        }
    }

    @Test
    fun part2_3() {
        val data = input?.split("\n")?.get(2)

        data?.let {
            val output = part2(it)
            assertEquals(output, 23)
        }
    }

    @Test
    fun part2_4() {
        val data = input?.split("\n")?.get(3)

        data?.let {
            val output = part2(it)
            assertEquals(output, 29)
        }
    }

    @Test
    fun part2_5() {
        val data = input?.split("\n")?.get(4)

        data?.let {
            val output = part2(it)
            assertEquals(output, 26)
        }
    }

}