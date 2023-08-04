package com.app.myapplication3.models

import androidx.lifecycle.MutableLiveData
import com.app.myapplication3.utilities.common.pojo.ValidationsStatus
import com.app.myapplication3.utilities.daggerinjections.annotations.scopes.ApplicationScope
import com.app.myapplication3.utilities.retrofit.APIHelper
import com.app.myapplication3.utilities.retrofit.RetrofitService
import com.app.myapplication3.views.activities.data.DataPOJO

import javax.inject.Inject

@ApplicationScope
class DataModel

@Inject
constructor(private val retrofitService: RetrofitService)
{

    var status: ValidationsStatus = ValidationsStatus()

    @Inject
    lateinit var apiHelper: APIHelper

    fun dataCheck(emailOrPhone : String, password: String, has_activate_account : String, data : MutableLiveData<DataPOJO>, loader : MutableLiveData<Boolean>){

      //  loader.value = true
/*        apiHelper.enqueueWithRetry(retrofitService.signIn(
            Constants.auth_key , emailOrPhone ,  password ,has_activate_account, Constants.DEVICE_ID , Constants.DEVICE_TYPE) ,Constants.RETRY_COUNT , object :
            Callback<SignInPojo>
        {
            override fun onResponse(call: Call<SignInPojo>, response: Response<SignInPojo>) {

                loader.value = false
                data.value = response.body()!!
            }
            override fun onFailure(call: Call<SignInPojo>, t: Throwable) {
                loader.value = false
                val mStatus  =
                    SignInPojo()
                mStatus.status= false
                mStatus.message = "Something went wrong! Please try again later."
                data.value = mStatus
            }
        })
        return data*/

    }
}