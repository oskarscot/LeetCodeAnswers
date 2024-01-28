class TwoSum {

    // Time complexity: O(n^2)
    // Bruteforce solution for Two Sum problem
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        // Loop through the array
        for ((index, value) in nums.withIndex()) { // O(n)
            // Check if the complement is in the map
            val complement = target - value
            if (map.containsKey(complement)) {
                // Return the indices
                return intArrayOf(map[complement]!!, index)
            }
            // Add the value to the map
            map[value] = index
        }
        // No solution found
        throw Exception("No two sum solution")
    }
}

fun main() {
    val twoSum = TwoSum()
    println(twoSum.twoSum(intArrayOf(2, 7, 11, 15), 9).contentToString())
    println(twoSum.twoSum(intArrayOf(3, 2, 4), 6).contentToString())
    println(twoSum.twoSum(intArrayOf(3, 3), 6).contentToString())
}