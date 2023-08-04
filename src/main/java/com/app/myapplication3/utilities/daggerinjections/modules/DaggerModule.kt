package com.app.myapplication3.utilities.daggerinjections.modules

import android.content.Context
import android.content.SharedPreferences
import com.app.myapplication3.utilities.daggerinjections.annotations.scopes.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
class DaggerModule(val context: Context) {

    @Provides
    @ApplicationScope
    fun provideContext() : Context{
        return context
    }

    @Provides
    @ApplicationScope
    fun provideSharedPreference() : SharedPreferences{
        return context.getSharedPreferences("Shared Preference", Context.MODE_PRIVATE)
    }
}