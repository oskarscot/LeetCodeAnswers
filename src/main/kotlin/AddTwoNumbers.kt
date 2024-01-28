package scot.oskar.leetcode

class AddTwoNumbers {

    class ListNode(var r: Int) {
        var next: ListNode? = null
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    // Solution for Add Two Numbers problem
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        // Create a dummy node
        val placeholder = ListNode(0)
        // Create a pointer to the dummy node
        var current = placeholder
        // Create a pointer to the first list
        var a = l1
        // Create a pointer to the second list
        var b = l2
        // Create a carry variable
        var carry = 0

        // Loop through the lists
        while (a != null || b != null) { // O(n)
            // Get the values
            val x = a?.r ?: 0
            val y = b?.r ?: 0
            // Calculate the sum
            val sum = carry + x + y
            // Update the carry
            carry = sum / 10
            // Create a new node
            current.next = ListNode(sum % 10)
            // Move the pointer
            current = current.next!!
            // Move the pointers
            a = a?.next
            b = b?.next
        }

        // Check if there is a carry
        if (carry > 0) {
            // Create a new node
            current.next = ListNode(carry)
        }
        // Return the next node
        return placeholder.next!!
    }
}

fun main() {
    val addTwoNumbers = AddTwoNumbers()
    val l1 = AddTwoNumbers.ListNode(2)
    l1.next = AddTwoNumbers.ListNode(4)
    l1.next!!.next = AddTwoNumbers.ListNode(3)
    val l2 = AddTwoNumbers.ListNode(5)
    l2.next = AddTwoNumbers.ListNode(6)
    l2.next!!.next = AddTwoNumbers.ListNode(4)
    addTwoNumbers.addTwoNumbers(l1, l2)?.let {
        println("${it.r}, ${it.next?.r}, ${it.next?.next?.r}")
    }
}