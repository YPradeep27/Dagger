package com.app.myapplication3.utilities.common

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.myapplication3.utilities.common.pojo.ApiStatus
import io.reactivex.disposables.CompositeDisposable

open class BaseViewModel : ViewModel() {

    val loader : MutableLiveData<Boolean> = MutableLiveData()
    val apiStatus : MutableLiveData<ApiStatus> = MutableLiveData()
    var compositeDisposable : CompositeDisposable = CompositeDisposable()


    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}