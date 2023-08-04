package com.app.myapplication3.views.activities.data

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.app.myapplication3.R
import com.app.myapplication3.databinding.ActivityMainBinding
import com.app.myapplication3.utilities.common.BaseActivity
import com.app.myapplication3.Constants
import com.app.myapplication3.viewmodels.DataViewModel

class DataActivity : BaseActivity() {

    lateinit var mViewModel:DataViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this@DataActivity, R.layout.activity_main)
        setContentView(binding.root)

        initializations()
        onClickListeners(binding)
        loadingObserver()
        validationObserver()
        apiObserver()

    }

    private fun apiObserver() {
    }

    private fun validationObserver() {
    }

    private fun loadingObserver() {

        mViewModel.loader.observe(this@DataActivity, Observer {




        })
    }

    private fun initializations() {
        mViewModel = ViewModelProviders.of(this@DataActivity, viewModelFactory).get(DataViewModel::class.java)
     //   mViewModel = ViewModelProvider(this@DataActivity, viewModelFactory).get(DataViewModel::class.java)

    }

    private fun onClickListeners(binding: ActivityMainBinding) {

        binding.btnSave.setOnClickListener {

            sharedPreference.saveString(Constants.sharedPreferenceDataKey,binding.inputField.text.toString())
        }

        binding.btnGet.setOnClickListener {

            binding.outputField.text = sharedPreference.getString(Constants.sharedPreferenceDataKey)
        }

    }

}