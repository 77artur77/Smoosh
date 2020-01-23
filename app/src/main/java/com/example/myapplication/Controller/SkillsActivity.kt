package com.example.myapplication.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.example.myapplication.EXTRA_LEAGUE
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
    fun onSkillFinishClicked(view: View){
        val finishActivity = Intent(this, FinishActivity::class.java)
        startActivity(finishActivity)
    }
    fun onBeginnerClicked(view: View){

    }
    fun onBallerClicked(view: View){
        beginnerSkillsBtn.isChecked = false
    }


}
