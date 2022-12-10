package lib

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MoveTest {

    private val moveRock = Move.Rock
    private val movePaper = Move.Paper
    private val moveScissor = Move.Scissor

    @Test
    fun compareRockAgainstPaper() {
        assertTrue(moveRock < movePaper)
    }

    @Test
    fun comparePaperAgainstScissor() {
        assertTrue(movePaper < moveScissor)
    }

    @Test
    fun compareScissorAgainstRock() {
        assertTrue(moveScissor < moveRock)
    }

    @Test
    fun compareRockAgainstScissor(){
        assertTrue(moveRock > moveScissor)
    }

    @Test
    fun compareScissorAgainstPaper(){
        assertTrue(moveScissor > movePaper)
    }

    @Test
    fun comparePaperAgainstRock(){
        assertTrue(movePaper > moveRock)
    }

}