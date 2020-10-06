package com.example.amrilgithubuserapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_menu_utama.*

class MenuUtama : AppCompatActivity() {
    private var userlist: ArrayList<UserData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)

        userlist.addAll(ObjUserData.listData)
        showRecyclerView()


    }

    private fun showRecyclerView() {
        recyclerview_user.layoutManager = LinearLayoutManager(this)
        val RvaAdapter = UsersAdapter(userlist)
        recyclerview_user.adapter = RvaAdapter

        RvaAdapter.setOnItemClickCallback(object : UsersAdapter.OnItemClickCallback {
            override fun onItemClicked(data: UserData) {
                showSelectedData(data)
            }
        })
    }

    private fun showSelectedData(userdata: UserData) {
        val usersdata = UserData(
            userdata.username,
            userdata.name,
            userdata.avatar,
            userdata.company,
            userdata.location,
            userdata.repository,
            userdata.follower,
            userdata.following
        )
        val pindah = Intent(this@MenuUtama, Detaildatauser::class.java)
        pindah.putExtra(Detaildatauser.EXTRA_DATA,usersdata)
        startActivity(pindah)
    }
}



