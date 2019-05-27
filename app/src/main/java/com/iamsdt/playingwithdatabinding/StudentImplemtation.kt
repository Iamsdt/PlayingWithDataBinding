package com.iamsdt.playingwithdatabinding

import androidx.databinding.Bindable
import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry

class StudentImplemtation(var _title: String) : Observable {

    private var registry: PropertyChangeRegistry = PropertyChangeRegistry()

    var title: String
        @Bindable
        get() = _title
        set(value) {
            _title = value
            //use in xml
            //registry.notifyChange(this, BR.title)
        }

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        registry.add(callback)
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        registry.remove(callback)
    }


}