package android.example.myfitnessbuddy.ui

import android.example.myfitnessbuddy.model.KrachtOefeningGroep
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class KrachtTrainingViewModel : ViewModel() {

    // PROPERTIES
    private var naam: MutableLiveData<String>
    private var omschrijving: MutableLiveData<String>
    private var oefeningGroepen: MutableList<KrachtOefeningGroep>

    // INITIALIZATION
    init{
        this.naam = MutableLiveData()
        this.omschrijving = MutableLiveData()
        this.oefeningGroepen = mutableListOf<KrachtOefeningGroep>()
    }

    // SETTERS
    fun setNaam(naam: String){
        this.naam.value = naam
    }
    fun setOmschrijving(omschrijving: String){
        this.omschrijving.value = omschrijving
    }

    // GETTERS
    fun getNaam(): LiveData<String> {
        return this.naam
    }
    fun getOmschrijving(): LiveData<String>{
        return this.omschrijving
    }
    fun getOefeningGroepen(): List<KrachtOefeningGroep> {
        return this.oefeningGroepen
    }

    // OTHER FUNCTIONS
    fun addOefeningGroep(oefeningGroep: KrachtOefeningGroep){
        this.oefeningGroepen.add(oefeningGroep)
    }
    fun removeOefeningGroep(index: Int){
        this.oefeningGroepen.removeAt(index)
    }


}