package com.app.myapplication3

import android.app.Application
import com.app.myapplication3.utilities.daggerinjections.component.MyComponent
import timber.log.Timber

class MyApplication : Application() {

    lateinit var myComponent: MyComponent

    override fun onCreate() {
        super.onCreate()

      /*  myComponent = DaggerMyComponent.builder().daggerModule(
            DaggerModule(
                this
            )
        )
            .build()*/

        //---------Timber object build-----------
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

    }
}