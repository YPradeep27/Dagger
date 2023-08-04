package com.app.myapplication3.utilities.daggerinjections.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.myapplication3.utilities.common.ViewModelFactory
import com.app.myapplication3.utilities.daggerinjections.annotations.ViewModelKey
import com.app.myapplication3.viewmodels.DataViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(DataViewModel::class)
    abstract fun bindsDataViewModel(viewModel: DataViewModel) : ViewModel

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory


}