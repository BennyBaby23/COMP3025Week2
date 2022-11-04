package com.mdev.comp3025_week_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //result label
        val ResultLabel = findViewById(R.id.Result_TextView) as TextView


        // named event handler
        fun NumberButtons(view: View)
        {
            val buttonInfo = view as Button

            println(buttonInfo.text)
        }

        fun OperatorButtons(view: View)
        {
            val buttonInfo = view as Button

            println(buttonInfo.text)
        }







        findViewById<Button>(R.id.Clear_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Backspace_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Percent_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Divide_Button).setOnClickListener { view -> OperatorButtons(view) }

        findViewById<Button>(R.id.Seven_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Eight_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Nine_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Multiply_Button).setOnClickListener { view -> OperatorButtons(view) }

        findViewById<Button>(R.id.Four_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Five_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Six_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Minus_Button).setOnClickListener { view -> OperatorButtons(view) }

        findViewById<Button>(R.id.One_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Two_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Three_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Plus_Button).setOnClickListener { view -> OperatorButtons(view) }

        findViewById<Button>(R.id.Zero_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Decimal_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Plus_Minus_Button).setOnClickListener { view -> OperatorButtons(view) }
        findViewById<Button>(R.id.Equals_Button).setOnClickListener { view -> OperatorButtons(view) }
    }
}