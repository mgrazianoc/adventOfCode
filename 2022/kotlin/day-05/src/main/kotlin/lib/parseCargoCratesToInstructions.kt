package lib

fun parseCargoCratesToInstructions(input: String): List<MoveInstruction> {
    /**
     * move 1 from 2 to 1
     * move 3 from 1 to 3
     * move 2 from 2 to 1
     * move 1 from 1 to 2
     * */

    return input.split("\n").map {
        // ex: it = "move 1 from 2 to 1"
        it.replace("move ", "")
            .replace(" from ", ":")
            .replace(" to ", ":")
            .split(":")
    }.map {
        // ex: it = listOf(1, 2, 1)

        MoveInstruction(
            boxes = it[0].toInt(),
            from = it[1].toInt(),
            to = it[2].toInt()
        )
    }
}