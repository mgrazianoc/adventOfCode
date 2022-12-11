package lib

fun parseCargoCratesToSlots(input: String): Map<Int, MutableList<String>> {
    val cargoCrane = input.split("\n")

    // ex: stacks = listOf(listOf("D"), listOf("N", "C"), listOf("Z", "M", "P"))
    val stacks = cargoCrane.take(cargoCrane.size - 1).map { cranes ->
        // ex: cranes = "    [C]             [L]         [T]"

        cranes.chunked(4)
            .map { cargo -> cargo.replace("   ", "[X]") }
            .reduce { acc, s -> acc + s }
            .split("] [").map { cargo ->
            // ex: cargo = [C]
            cargo.replace("[", "").replace("]", "")
        }
    }

    val slots = mutableMapOf<Int, MutableList<String>>()
    stacks.forEach{ cargo ->
        // ex: cargo = listOf("Z", "M", "P")

        cargo.forEachIndexed { index, s ->
            if (s != "X"){
                slots.putIfAbsent(index + 1, mutableListOf())
                slots[index + 1]?.add(0, s)
            }
        }
    }

    return slots
}