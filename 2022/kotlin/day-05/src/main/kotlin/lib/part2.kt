package lib

fun part2(input: String): String {
    val info = input.split("\n\n")

    val slots = parseCargoCratesToSlots(info.first())
    val instructions = parseCargoCratesToInstructions(info.last())

    instructions.forEach { moveInstruction: MoveInstruction ->
        val cargo = mutableListOf<String>()

        repeat(moveInstruction.boxes){
            slots[moveInstruction.from]?.removeLast()?.let { it1 -> cargo.add(it1) }
        }

        repeat(moveInstruction.boxes){
            slots[moveInstruction.to]?.add(cargo.removeLast())
        }
    }

    // ugly, but I need to get the results ordered by index
    // and maps don't have order by definition
    var top = ""
    for (i in 1 .. slots.size){
        top += slots[i]?.last()
    }

    return top
}