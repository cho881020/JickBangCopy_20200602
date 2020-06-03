package kr.co.tjoeun.jickbangcopy_20200602.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.jickbangcopy_20200602.R
import kr.co.tjoeun.jickbangcopy_20200602.datas.Room

class RoomAdapter(context: Context, resId: Int, list: List<Room>) : ArrayAdapter<Room>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        tempRow?.let {
//            null이 아닐때 실행할 내용
        }.let {
//            null이 맞을때 실행
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        val row = tempRow!!

        val priceTxt = row?.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descTxt = row.findViewById<TextView>(R.id.descTxt)

        val data = mList[position]

        priceTxt.text = data.getFormmatedPrice()

        addressAndFloorTxt.text = "${data.address}, ${data.getFormmatedFloor()}"

        descTxt.text = data.description

        return row
    }

}