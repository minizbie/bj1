package bj1

import org.junit.Test
import kotlin.test.assertEquals

class CardTest {

    @Test
    fun t1() {
        val c1 = Card(value = 1, suit = 1)
        val c2 = Card(value = 13, suit = 4)

        assertEquals(1, c1.value)
        assertEquals(1, c1.suit)
        assertEquals("Spades", c1.suitName)
        assertEquals("Ace", c1.valueName)
        assertEquals("Ace of Spades", c1.name)
        assertEquals(1, c1.points)

        assertEquals(13, c2.value)
        assertEquals(4, c2.suit)
        assertEquals("Diamonds", c2.suitName)
        assertEquals("King", c2.valueName)
        assertEquals("King of Diamonds", c2.name)
        assertEquals(10, c2.points)
    }
    @Test
    fun t2() {
        val x = if (3<4) "aa" else "bb"

        val suit=2
        val y = when (suit){
            1->"Spades"
            2->"Hearts"
            3->"Clubs"
            4->"Diamonds"
            else->"oops"
        }

        println("x = ${x}")
        println("y = ${y}")

        val r = 1..4 // range object

        println(r.contains(3))
        println(3 in r)

    }
}