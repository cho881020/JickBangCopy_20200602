package kr.co.tjoeun.jickbangcopy_20200602

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kr.co.tjoeun.jickbangcopy_20200602.datas.Room

class ViewRoomDetailActivity : BaseActivity() {

    lateinit var mRoom:Room

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mRoom = intent.getSerializableExtra("roomData") as Room

        priceTxt.text = mRoom.getFormmatedPrice()
        descTxt.text = mRoom.description

        addressTxt.text = mRoom.address
        floorTxt.text = mRoom.getFormmatedFloor()
    }

}
