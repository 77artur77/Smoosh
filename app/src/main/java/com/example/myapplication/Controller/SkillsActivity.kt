package com.example.myapplication.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.Utilities.EXTRA_LEAGUE
import com.example.myapplication.R
import com.example.myapplication.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)
    }
    fun onSkillFinishClicked(view: View){
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please choose a skill", Toast.LENGTH_SHORT).show()
        }

    }
    fun onBeginnerClicked(view: View){
        ballerSkillsBtn.isChecked = false
        skill = "beginner"
    }
    fun onBallerClicked(view: View){
        beginnerSkillsBtn.isChecked = false
        skill = "baller"
    }

}
