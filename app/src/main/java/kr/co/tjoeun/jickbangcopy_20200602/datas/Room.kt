package kr.co.tjoeun.jickbangcopy_20200602.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class Room(val price:Int, val address:String, val floor:Int, val description:String) : Serializable {

    fun getFormmatedPrice() : String {

        if (this.price < 10000) {
            return NumberFormat.getInstance().format(this.price)
        }
        else {
//            28500 / 10000 => 2 => 2억
            val uk = this.price / 10000
//            28500 % 10000 => 8500
            val remainder = this.price % 10000

            return "${uk}억 ${NumberFormat.getInstance().format(remainder)}"
        }

    }

    fun getFormmatedFloor() : String {
        if (this.floor > 0) {
            return "${this.floor}층"
        }
        else if (this.floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }
    }

}