package lib

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ParseCargoCratesToSlotsKtTest {

    @Test
    fun parseCargoCratesToSlots() {
        val input = "    [D]    \n" +
                "[N] [C]    \n" +
                "[Z] [M] [P]\n" +
                " 1   2   3 "

        val output = parseCargoCratesToSlots(input)
        assertEquals(
            mapOf(
                1 to listOf("Z", "N"),
                2 to listOf("M", "C", "D"),
                3 to listOf("P")
            ),
            output
        )

    }

    @Test
    fun parseCargoCratesToSlotsMain() {
        val input = "    [C]             [L]         [T]\n" +
                "    [V] [R] [M]     [T]         [B]\n" +
                "    [F] [G] [H] [Q] [Q]         [H]\n" +
                "    [W] [L] [P] [V] [M] [V]     [F]\n" +
                "    [P] [C] [W] [S] [Z] [B] [S] [P]\n" +
                "[G] [R] [M] [B] [F] [J] [S] [Z] [D]\n" +
                "[J] [L] [P] [F] [C] [H] [F] [J] [C]\n" +
                "[Z] [Q] [F] [L] [G] [W] [H] [F] [M]\n" +
                " 1   2   3   4   5   6   7   8   9"

        val output = parseCargoCratesToSlots(input)
        assertEquals(
            mapOf(
                1 to listOf("Z", "J", "G"),
                2 to listOf("Q", "L", "R", "P", "W", "F", "V", "C"),
                3 to listOf("F", "P", "M", "C", "L", "G", "R"),
                4 to listOf("L", "F", "B", "W", "P", "H", "M"),
                5 to listOf("G", "C", "F", "S", "V", "Q"),
                6 to listOf("W", "H", "J", "Z", "M", "Q", "T", "L"),
                7 to listOf("H", "F", "S", "B", "V"),
                8 to listOf("F", "J", "Z", "S"),
                9 to listOf("M", "C", "D", "P", "F", "H", "B", "T")
            ),
            output
        )

    }
}