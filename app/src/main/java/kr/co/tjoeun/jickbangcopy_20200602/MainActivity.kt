package kr.co.tjoeun.jickbangcopy_20200602

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.jickbangcopy_20200602.adapters.RoomAdapter
import kr.co.tjoeun.jickbangcopy_20200602.datas.Room

class MainActivity : BaseActivity() {

    val roomArrayList = ArrayList<Room>()
    lateinit var myAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        roomListView.setOnItemClickListener { parent, view, position, id ->
            val clickedRoom = roomArrayList[position]

            val myIntent = Intent(mContext, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("roomData", clickedRoom)
            startActivity(myIntent)
        }

    }

    override fun setValues() {
        addRooms()

        myAdapter = RoomAdapter(mContext, R.layout.room_list_item, roomArrayList)
        roomListView.adapter = myAdapter
    }

    fun addRooms() {
        roomArrayList.add(Room(7500, "마포구 서교동", 3, "마포구 서교동 3층 방입니다."))
        roomArrayList.add(Room(23800, "마포구 서교동", 5, "마포구 서교동 5층 방입니다."))
        roomArrayList.add(Room(16800, "마포구 서교동", 0, "마포구 서교동 반지하 방입니다."))
        roomArrayList.add(Room(4000, "마포구 망원동", -1, "마포구 망원동 지하1층 방입니다."))
        roomArrayList.add(Room(58000, "마포구 망원동", -2, "마포구 망원동 지하2층 방입니다."))
        roomArrayList.add(Room(13500, "마포구 망원동", 3, "마포구 망원동 3층 방입니다."))
        roomArrayList.add(Room(6500, "마포구 성산동", 6, "마포구 성산동 6층 방입니다."))
        roomArrayList.add(Room(3800, "마포구 성산동", 8, "마포구 성산동 8층 방입니다."))
        roomArrayList.add(Room(12500, "마포구 성산동", 0, "마포구 성산동 반지하 방입니다."))
        roomArrayList.add(Room(24500, "마포구 성산동", -1, "마포구 성산동 지하1층 방입니다."))
    }

}
