package com.app.myapplication3.viewmodels

import androidx.lifecycle.MutableLiveData
import com.app.myapplication3.models.DataModel
import com.app.myapplication3.utilities.common.BaseViewModel
import com.app.myapplication3.views.activities.data.DataPOJO
import javax.inject.Inject

class DataViewModel
@Inject
constructor(public val dataModel: DataModel) : BaseViewModel(){

    var dataApiResult : MutableLiveData<DataPOJO> = MutableLiveData()


    fun dataCheck(emailOrPhone : String  ,password: String,has_activate_account : String, data : MutableLiveData<DataPOJO>, loader : MutableLiveData<Boolean>){

        dataModel.dataCheck(emailOrPhone,password,has_activate_account, data, loader)
    }


}
