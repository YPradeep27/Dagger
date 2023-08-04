package com.app.myapplication3.utilities.daggerinjections.modules

import android.content.SharedPreferences
import javax.inject.Inject

class HelperSharedPreference
    @Inject
    constructor(var sharedPreferences: SharedPreferences) {

    fun saveString(key : String,vaue : String){
        val editor = sharedPreferences.edit()
        editor.putString(key,vaue)
        editor.apply()
        editor.commit()

    }

    fun saveInt(key: String,value:Int){
        val editor = sharedPreferences.edit()
        editor.putInt(key,value)
        editor.apply()
        editor.commit()
    }

    fun getString(key: String) : String?{
        return sharedPreferences.getString(key,"")
    }
}