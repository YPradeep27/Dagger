package com.app.myapplication3.utilities.daggerinjections.component

import com.app.myapplication3.utilities.common.BaseActivity
import com.app.myapplication3.utilities.common.BaseFragment
import com.app.myapplication3.utilities.daggerinjections.annotations.scopes.ApplicationScope
import com.app.myapplication3.utilities.daggerinjections.modules.DaggerModule
import com.app.myapplication3.utilities.daggerinjections.modules.DatabaseModule
import com.app.myapplication3.utilities.daggerinjections.modules.RetrofitModule
import com.app.myapplication3.utilities.daggerinjections.modules.ViewModelModule
import dagger.Component

@ApplicationScope
@Component(modules = [DaggerModule::class,RetrofitModule::class,DatabaseModule::class,ViewModelModule::class])
interface MyComponent {

    fun inject(activity: BaseActivity)
    fun inject(fragment: BaseFragment)
}