package lib

fun part1(input: String): Int {

   return input.split("\n").map { items ->
      // ex: items = "vJrwpWtwJgWrhcsFMMfFFhFp"

      val haftSize = items.length / 2

      Pair(
         items.subSequence(0, haftSize).toSet(),
         items.substring(haftSize).toSet()
      )
   }.map { items ->
      // ex: items = Pair(["vJrwpWtwJgWr"], ["hcsFMMfFFhFp"])

      items.first.intersect(items.second).first()
   }.sumOf {
      parseItem(it)
   }

}