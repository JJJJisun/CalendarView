package com.jjjjisun.calendarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            diaryTextView.visibility = View.VISIBLE //해당날짜가 뜨는 textView가 visible
            save_btn.visibility = View.VISIBLE //저장버튼이 visible
            contextEdit.visibility = View.VISIBLE //editText가 visible

            textView2.visibility = View.INVISIBLE //저장된 일기 textView Invisiable
            cha_btn.visibility = View.INVISIBLE //수정버튼 Invisible
            del_btn.visibility = View.INVISIBLE //삭제버튼 Invisible

            diaryTextView.text = String.format("%d / %d / %d", year, month + 1, dayOfMonth)
            contextEdit.setText("")


        }


    }
}