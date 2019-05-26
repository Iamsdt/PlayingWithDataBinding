package com.iamsdt.playingwithdatabinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Student(
    var _name: String
) : BaseObservable() {

    var name: String
        @Bindable
        get() = _name
        set(value) {
            _name = value
            notifyPropertyChanged(BR.name)
        }

}