package Add_Two_Numbers

import com.sun.jdi.IntegerValue
import java.lang.StringBuilder

fun main () {

}

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var digits1: StringBuilder = StringBuilder()
        var digits2: StringBuilder = StringBuilder()

        var next1: ListNode? = l1?.next
        var next2: ListNode? = l2?.next

        repeat(3) {
            digits1.insert(0, next1?.`val`)
            digits2.insert(0, next2?.`val`)

            next1 = next1?.next
            next2 = next2?.next
        }

        val sum: Int? = digits2.toString().toIntOrNull()?.let { digits1.toString().toIntOrNull()?.plus(it) }
        val sumString: String = sum.toString()

        for (i in sumString.iterator()) {
            val test: Int = sumString.length.minus(i.toInt())
            var retAns: ListNode = ListNode(sumString[test].toInt())
        }
    }

    fun getNode(ln: ListNode): ListNode {
        if (ln.next == null) return ListNode()

        val tmp_listNode = ListNode()

        return getNode()
    }
}


class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
