package lib

fun part2(input: String): Int {

    return input.split("\n").chunked(3).map { group ->
        /**
         * ex: group = listOf(
         *      "vJrwpWtwJgWrhcsFMMfFFhFp",
         *      "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
         *      "PmmdzqPrVvPwwTWBwg"
         * )
         * */

        group.map { elven -> elven.toSet() }
    }.map { group ->
        /**
         * ex: group = listOf(
         *      ["vJrwpWtwJgWrhcsFMMfFFhFp"],
         *      ["jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"],
         *      ["PmmdzqPrVvPwwTWBwg"]
         * )
         * */

        group.reduce{ one, two -> one.intersect(two) }.first()

    }.sumOf { parseItem(it) }

}