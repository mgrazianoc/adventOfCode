package lib

fun part1(input: String): Int {
    return input.split("\n").map { assignmentPair ->
        // ex: assignmentPair = 2-8,3-7

        val ap = assignmentPair.split(",")
        Pair(ap.first(), ap.last())
    }.map { assignmentPair ->
        // ex: assignmentPair = Pair(2-8,3-7)

        val first = assignmentPair.first.split("-")
        val firstRange = first.first().toInt()..first.last().toInt()

        val second = assignmentPair.second.split("-")
        val secondRange = second.first().toInt()..second.last().toInt()

        (firstRange.first <= secondRange.first && secondRange.last <= firstRange.last)
                ||
        (secondRange.first <= firstRange.first && firstRange.last <= secondRange.last)
    }.count { it }
}