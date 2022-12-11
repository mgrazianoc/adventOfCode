package lib

fun part1(input: String): String {
    val info = input.split("\n\n")

    val slots = parseCargoCratesToSlots(info.first())
    val instructions = parseCargoCratesToInstructions(info.last())

    instructions.forEach { moveInstruction: MoveInstruction ->
        repeat(moveInstruction.boxes){
            val cargo = slots[moveInstruction.from]?.removeLast()
            if (cargo != null) {
                slots[moveInstruction.to]?.add(cargo)
            }
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