package lib

sealed class Move(val points: Int): Comparable<Move> {

    object Rock: Move(1)
    object Paper: Move(2)
    object Scissor: Move(3)

    override fun compareTo(other: Move): Int = when(this) {
        is Scissor -> {
            when (other){
                is Rock -> {
                    -1
                }
                else -> {
                    this.points compareTo other.points
                }
            }
        }

        is Rock -> {
            when (other){
                is Scissor -> {
                    1
                }
                else -> {
                    this.points compareTo other.points
                }
            }
        }

        Paper -> {
            this.points compareTo other.points
        }
    }


    companion object {

        fun parse(move: String): Move = when (move) {
            "A" -> {
                Rock
            }

            "B" -> {
                Paper
            }

            else -> {
                Scissor
            }
        }

    }

}