package com.app.myapplication3.utilities.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.app.myapplication3.MyApplication
import com.app.myapplication3.utilities.daggerinjections.modules.HelperSharedPreference
import javax.inject.Inject

open class BaseActivity : AppCompatActivity() {


    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var sharedPreference: HelperSharedPreference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as MyApplication).myComponent.inject(this)
    }
}