package com.example.myrecicler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecicler.databinding.ActivityMainBinding
import layout.RecyAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        with (binding) {
            var viewAdapter: RecyclerView.Adapter<*>
            val layoutManager = LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL, true)

            viewAdapter = RecyAdapter(lista(),this@MainActivity)

            ricicloViu.setHasFixedSize(true)
            ricicloViu.layoutManager = layoutManager
            ricicloViu.adapter = viewAdapter
        }

        setContentView(binding.root)
    }
}