package lib

fun part1(input: String): Int {
    return input.split("\n").map { play ->
        // ex: play = "A X"

        play.split(" ").map { move ->
            // ex: it = "X"

            when (move) {
                "X" -> {
                    Move.Rock
                }
                "Y" -> {
                    Move.Paper
                }
                "Z" -> {
                    Move.Scissor
                }
                else -> {
                    Move.parse(move)
                }
            }
        }

    }.sumOf { moves: List<Move> ->
        // ex moves = listOf(Move.Rock, Move.Paper)

        when {
            moves.first() > moves.last() -> {
                moves.last().points
            }

            moves.last() > moves.first() -> {
                6 + moves.last().points
            }

            else -> {
                3 + moves.last().points
            }
        }

    }
}