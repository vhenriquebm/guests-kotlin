package com.example.guests.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.guests.R
import com.example.guests.databinding.ActivityGuestFormBinding
import com.example.guests.viewmodel.GuestFormViewModel

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityGuestFormBinding
    private lateinit var viewModel: GuestFormViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        configureView()
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_save) {
        }
    }

    private fun configureViewModel() {
        viewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)
    }

    private fun configureView() {
        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSave.setOnClickListener(this)
        binding.radioPresent.isChecked = true
    }
}