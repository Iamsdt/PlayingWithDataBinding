package com.iamsdt.playingwithdatabinding.arc

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RcvViewModel:ViewModel(){

    val nameList = MutableLiveData<List<RcvModel>>()

    fun insertDummyData(){
        val list = listOf(
            RcvModel("Shudipto"),
            RcvModel("Shudipto 2"),
            RcvModel("Shudipto 3"),
            RcvModel("Shudipto 4"),
            RcvModel("Shudipto 5"),
            RcvModel("Shudipto 6"),
            RcvModel("Shudipto 7")
        )

        nameList.value = list
    }

}