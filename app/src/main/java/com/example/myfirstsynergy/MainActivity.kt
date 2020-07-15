package com.example.myfirstsynergy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myfirstsynergy.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        //TODO USING FINDVIEWBYID HERE
        val hideFindViewByIdText: TextView = findViewById(R.id.txt_findbyview)
        hideFindViewByIdText.setText(R.string.dummy_findby)
        hideFindViewByIdText.visibility = View.GONE
        val btnFindViewById: Button = findViewById(R.id.btn_findbyview)
        btnFindViewById.setOnClickListener {
            btnFindViewById.setBackgroundResource(R.color.dark_btn_findbyview)
            hideFindViewByIdText.visibility = View.VISIBLE
        }
        //TODO USING KOTLIN SYNTHETIC HERE
        txt_kotlin_synthetic.visibility = View.GONE
        txt_kotlin_synthetic.setText(R.string.dummy_kotlin_synthetic)
        btn_kotlin_synthetic.setOnClickListener {
            btn_kotlin_synthetic.setBackgroundResource(R.color.dark_btn_kotlin)
            txt_kotlin_synthetic.visibility = View.VISIBLE
        }

        //TODO USING VIEW BINDING HERE
        binding.titlenya.setText(R.string.dummy_title)
        binding.txtViewBinding.visibility = View.GONE
        binding.txtViewBinding.setText(R.string.dummy_view_binding)
        binding.btnViewBinding.setOnClickListener {
            binding.btnViewBinding.setBackgroundResource(R.color.dark_btn_view)
            binding.txtViewBinding.visibility = View.VISIBLE
        }
        //TODO USING DATA BINDING HERE
        binding.txtDataBinding.visibility = View.GONE
        binding.txtDataBinding.setText(R.string.dummy_data_binding)
        binding.btnDataBinding.setOnClickListener {
            binding.btnDataBinding.setBackgroundResource(R.color.dark_btn_data)
            binding.txtDataBinding.visibility = View.VISIBLE
        }


    }
}








//        //TODO I create a show result
//        showResult.setText(R.string.showResult)
//        showResult.setTextColor(getColor(R.color.colorShow))
//        showResult.visibility = View.GONE
//        //TODO I create a button
//        buttonFlip.setText(R.string.dummy_scan_ninja)
//        buttonFlip.setTextColor(getColor(R.color.colorAccent))
//        buttonFlip.setBackgroundResource(R.drawable.btn_flip_background)
//
//        buttonFlip.setOnClickListener {
//            showResult.visibility = View.VISIBLE }

//        //TODO Create Scan Title Jutsu
//        JutsuCard.setText(R.string.scanning_jutsu)
//        //TODO I create a new Jutsu
//        TestingKt.setText(R.string.dummy_jutsu)
//        //TODO I create a jutsu image
//        imageJutsu.setBackgroundResource(R.drawable.summon)