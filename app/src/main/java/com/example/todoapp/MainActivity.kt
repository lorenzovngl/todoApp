package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val add : Button= findViewById(R.id.add)
        add.setOnClickListener {
           Toast.makeText(this,"happening",Toast.LENGTH_LONG).show()
            val intent = Intent(this,CreateCard::class.java)
            startActivity(intent)
            finish()
        }

        val deleteAll : Button = findViewById(R.id.deleteAll)
        deleteAll.setOnClickListener {
            DataObject.deleteAll()
        }


        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = Adapter(DataObject.getAlldata())
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}