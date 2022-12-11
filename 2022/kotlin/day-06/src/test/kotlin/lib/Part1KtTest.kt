package lib

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Part1KtTest {

    private val input = this::class.java.getResourceAsStream("/input.txt")?.bufferedReader()?.readText()

    @Test
    fun part1_1() {
        val data = input?.split("\n")?.get(0)

        data?.let {
            val output = part1(it)
            assertEquals(output, 7)
        }
    }

    @Test
    fun part1_2() {
        val data = input?.split("\n")?.get(1)

        data?.let {
            val output = part1(it)
            assertEquals(output, 5)
        }
    }

    @Test
    fun part1_3() {
        val data = input?.split("\n")?.get(2)

        data?.let {
            val output = part1(it)
            assertEquals(output, 6)
        }
    }

    @Test
    fun part1_4() {
        val data = input?.split("\n")?.get(3)

        data?.let {
            val output = part1(it)
            assertEquals(output, 10)
        }
    }

    @Test
    fun part1_5() {
        val data = input?.split("\n")?.get(4)

        data?.let {
            val output = part1(it)
            assertEquals(output, 11)
        }
    }
}