package edu.temple.classactivity

import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

   private lateinit var clickMeButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //clickMeButton = findViewById(R.id.clickMeButton)

//        findViewById<Button>(R.id.clickMeButton).setOnClickListener { view: View ->
//            (view as Button).text = "Button clicked!"
//        }

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            (it as Button).text = "Button Clicked!"
        }

//        val ocl = object: OnClickListener{
//            override fun onClick(p0: View?){
//                (p0 as Button).text = "Button Clicked!"
//            }
//        }
    }

}