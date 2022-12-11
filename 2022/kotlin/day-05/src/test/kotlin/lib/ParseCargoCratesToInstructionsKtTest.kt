package lib

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ParseCargoCratesToInstructionsKtTest {

    @Test
    fun parseCargoCratesToInstructions() {
        val input = "move 1 from 2 to 1\n" +
                "move 3 from 1 to 3\n" +
                "move 2 from 2 to 1\n" +
                "move 1 from 1 to 2"

        val output = parseCargoCratesToInstructions(input)
        assertEquals(
            listOf(
                MoveInstruction(1, 2, 1),
                MoveInstruction(3, 1, 3),
                MoveInstruction(2, 2, 1),
                MoveInstruction(1, 1, 2),

                ),
            output
        )

    }
}