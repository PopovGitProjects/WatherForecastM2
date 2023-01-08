package com.popov.watherforecastm2.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.popov.watherforecastm2.network.HttpResponse
import com.popov.watherforecastm2.network.models.NetworkDataModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {
    private val liveData = MutableLiveData<NetworkDataModel>()
    val getLiveData: LiveData<NetworkDataModel> = liveData


    init {
        CoroutineScope(Dispatchers.IO).launch {
            liveData.postValue(HttpResponse().response("Perm"))
        }
    }
}