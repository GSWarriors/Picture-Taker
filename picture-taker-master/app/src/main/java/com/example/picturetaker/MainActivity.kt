package com.example.picturetaker

import android.os.Bundle
import android.app.Application
import butterknife.BindView
import butterknife.ButterKnife
import android.view.View
import android.widget.ImageView
//import android.support.v7.app.AppCompatActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {


    @JvmField @BindView(R.id.main_container)
    var mainContainer: ConstraintLayout? = null
    @JvmField @BindView(R.id.imgv_photo)
    var imgvPhoto: SimpleDraweeView? = null
    @JvmField @BindView(R.id.fab_capture)
    var fabCapturePhoto: FloatingActionButton? = null

    private val TAKE_PHOTO_REQUEST = 101
    private var mCurrentPhotoPath: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        //fabCapturePhoto?.setOnClickListener { validatePermissions() }

    }

}