package com.workbenchstudio.gbkotlinhomework02.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.workbenchstudio.gbkotlinhomework02.databinding.ActivityMainBinding
import com.workbenchstudio.gbkotlinhomework02.viewModel.MainViewModel

lateinit var viewModel: MainViewModel
lateinit var ui: ActivityMainBinding
lateinit var adapter: MainPageAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ui = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ui.root)
        setSupportActionBar(ui.toolbar)

        adapter = MainPageAdapter()
        ui.mainRecycler.adapter = adapter

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        viewModel.viewState().observe(this, Observer { state ->
            state?.let { adapter.notes = state.notes } })
    }
}