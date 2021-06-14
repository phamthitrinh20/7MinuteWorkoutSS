package com.trinhpham.a7minuteworkouts

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_exercise.toolbar_exercise_activity
import kotlinx.android.synthetic.main.dialog_custom_back_confirmation.*
import java.util.ArrayList

class DetailActivity : AppCompatActivity() {
    private var exerciseList: ArrayList<ExerciseModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setUpToolBar()
        getDataBundle()
    }

    private fun getDataBundle() {
        val bundle: Bundle? = intent.extras
        bundle?.let {
            exerciseList = Constants.defaultExerciseList()
            setUpView(bundle.getInt("currentIndex"))
        }
    }

    private fun setUpToolBar() {
        setSupportActionBar(toolbar_exercise_activity)
        val actionbar = supportActionBar
        if(actionbar!=null){
            actionbar.setDisplayHomeAsUpEnabled(true)
            actionbar.title = "Detail Exercise"
        }

        toolbar_exercise_activity.setNavigationOnClickListener{
            customDialogForBackButton()
        }
    }

    private fun setUpView(id: Int) {
        val exercise = exerciseList!![id]
        imageExercire.setImageResource(exercise.getImage())
        titleExercire.text = exercise.getName()
        setupAdapter(exercise.getStep())
    }

    private fun setupAdapter(arr:ArrayList<String>) {
        val layoutManager1 = LinearLayoutManager(this)
        layoutManager1.orientation = LinearLayoutManager.VERTICAL
        stepsExercire.layoutManager = layoutManager1
        val adapter1 = DetailAdapter(this, arr)
        adapter1.notifyDataSetChanged()

        stepsExercire.adapter = adapter1
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