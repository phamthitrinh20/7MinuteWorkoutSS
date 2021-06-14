package com.trinhpham.a7minuteworkouts

import android.app.Dialog
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_video.*
import kotlinx.android.synthetic.main.activity_video.toolbar_exercise_activity
import kotlinx.android.synthetic.main.dialog_custom_back_confirmation.*
import java.util.ArrayList

class VideoActivity : AppCompatActivity() {
    private var exerciseVideo: ArrayList<String>? = null
    private var currentVideo = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
        setUpToolBar()
        setUpView()
        setUpAction()
    }

    private fun setUpView() {
        exerciseVideo = Constants.defaultURLVideo()
        setUpVideoPlayer(exerciseVideo!![currentVideo])
        setUpToolBarVideo(currentVideo)
    }

    private fun setUpToolBarVideo(index: Int) {
        if(index == 0) {
            btnBack.visibility = View.GONE
        } else if (index == exerciseVideo!!.size - 1) {
            btnNext.visibility = View.GONE
        } else {
            btnNext.visibility = View.VISIBLE
            btnBack.visibility = View.VISIBLE
        }
    }

    private fun setUpAction() {
        btnBack.setOnClickListener {
            currentVideo = currentVideo - 1
            setUpVideoPlayer(exerciseVideo!![currentVideo])
            setUpToolBarVideo(currentVideo)
        }

        btnNext.setOnClickListener {
            currentVideo = currentVideo + 1
            setUpVideoPlayer(exerciseVideo!![currentVideo])
            setUpToolBarVideo(currentVideo)
        }
    }

    private fun setUpVideoPlayer(url: String) {
        val uri: Uri = Uri.parse(url)
        videoExercise.setVideoURI(uri)
        videoExercise.setMediaController(MediaController(this))
        videoExercise.requestFocus()
        videoExercise.start()
    }

    private fun setUpToolBar() {
        setSupportActionBar(toolbar_exercise_activity)
        val actionbar = supportActionBar
        if(actionbar!=null){
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.title = "Video Exercise"
        }

        toolbar_exercise_activity.setNavigationOnClickListener{
            customDialogForBackButton()
        }
    }

    private fun customDialogForBackButton(){
        val customDialog = Dialog(this)

        customDialog.setContentView(R.layout.dialog_custom_back_confirmation)
        customDialog.contentAlert.visibility = View.GONE
        customDialog.tvYes.setOnClickListener {
            finish()
            customDialog.dismiss()
        }
        customDialog.tvNo.setOnClickListener {
            customDialog.dismiss()
        }
        customDialog.show()
    }
}