/**
 * Companion Objects.
 *
 * @see [Object Keyword](https://play.kotlinlang.org/byExample/03_special_classes/04_Object)
 */

class BigBen {                                  //1 
    companion object Bonger {                   //2
        fun getBongs(nTimes: Int) {             //3
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    BigBen.getBongs(12)                         //4
}
