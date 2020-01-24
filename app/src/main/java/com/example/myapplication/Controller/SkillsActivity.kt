package com.example.myapplication.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.Model.Player
import com.example.myapplication.R
import com.example.myapplication.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skills.*

class SkillsActivity : BaseActivity() {
    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        println(player)
    }
    fun onSkillFinishClicked(view: View){
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please choose a skill", Toast.LENGTH_SHORT).show()
        }

    }
    fun onBeginnerClicked(view: View){
        ballerSkillsBtn.isChecked = false
        player.skill = "beginner"
    }
    fun onBallerClicked(view: View){
        beginnerSkillsBtn.isChecked = false
        player.skill = "baller"
    }

}
