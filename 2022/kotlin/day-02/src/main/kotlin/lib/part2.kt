package lib

fun part2(input: String): Int {
    return input.split("\n").map { play ->
        // ex: play = "A X"

        play.split(" ")
    }.map { moves ->

        // ex: moves = listOf("A", "X")

        when (moves.last()){
            "X" -> {
                when (val firstMove = Move.parse(moves.first())){
                    Move.Rock -> {
                        listOf(firstMove, Move.Scissor)
                    }
                    Move.Paper -> {
                        listOf(firstMove, Move.Rock)
                    }
                    else -> {
                        listOf(firstMove, Move.Paper)
                    }
                }
            }

            "Y" -> {
                val firstMove = Move.parse(moves.first())
                listOf(firstMove, firstMove)
            }

            else -> {
                when (val firstMove = Move.parse(moves.first())){
                    Move.Rock -> {
                        listOf(firstMove, Move.Paper)
                    }
                    Move.Paper -> {
                        listOf(firstMove, Move.Scissor)
                    }
                    else -> {
                        listOf(firstMove, Move.Rock)
                    }
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