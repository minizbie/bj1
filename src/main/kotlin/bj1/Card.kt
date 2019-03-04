package bj1

import java.lang.IllegalStateException

class Card(val value:Int, val suit:Int){

    val suitName:String get() = when (suit){
        1->"Spades"
        2->"Hearts"
        3->"Clubs"
        4->"Diamonds"
        else->throw IllegalStateException()
    }

    val valueName:String get() = when (value){
        1->"Ace"
        2->"Two"
        3->"Three"
        4->"Four"
        5->"Five"
        6->"Six"
        7->"Seven"
        8->"Eight"
        9->"Nine"
        10->"Ten"
        11->"Jack"
        12->"Queen"
        13->"King"
        else->throw IllegalStateException()
    }
}