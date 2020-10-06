package com.example.amrilgithubuserapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detaildatauser.*


class Detaildatauser : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detaildatauser)
        val usersData = intent.getParcelableExtra<UserData>(EXTRA_DATA) as UserData

        Ditem_name.text = usersData.name.toString()
        Ditem_username.text = usersData.username.toString()
        Dimg_item_photo.setImageResource(usersData.avatar)
        Ditem_company.text = usersData.company.toString()
        Ditem_lokasi.text = usersData.location.toString()
        Ditem_repository.text = usersData.repository.toString()
        Ditem_follower.text = usersData.follower.toString()
        Ditem_following.text = usersData.following.toString()


    }
}



