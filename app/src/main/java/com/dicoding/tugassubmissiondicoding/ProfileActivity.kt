package com.dicoding.tugassubmissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val actionbar = supportActionBar
        actionbar!!.title = "My Profile"

        val imgMe: ImageView = findViewById(R.id.img_profile)
        val nameMe: TextView = findViewById(R.id.tv_name_me)

        Glide.with(this)
            .load(R.drawable.profile_photo)
            .apply(RequestOptions())
            .into(imgMe)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }


}
