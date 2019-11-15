package android.example.myfitnessbuddy.ui

import android.example.myfitnessbuddy.model.KrachtTraining
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class KrachtTrainingViewModel : ViewModel() {

    private val _krachtTraining = MutableLiveData<KrachtTraining>()
    val krachtTraining: LiveData<KrachtTraining>
        get() = this._krachtTraining

    init{
        var training = KrachtTraining()
        this._krachtTraining.value = training
    }

    fun getNaam(): String{
        return this._krachtTraining.value?.getNaam().toString()
    }
    fun getOmschrijving(): String{
        return this._krachtTraining.value?.getOmschrijving().toString()
    }
    fun setNaam(naam: String){
        this._krachtTraining.value?.setNaam(naam)
    }
    fun setOmschrijving(omschrijving: String){
        this._krachtTraining.value?.setOmschrijving(omschrijving)
    }

}