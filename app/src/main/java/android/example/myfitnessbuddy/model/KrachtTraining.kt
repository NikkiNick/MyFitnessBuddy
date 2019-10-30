package android.example.myfitnessbuddy.model

import android.os.Parcel
import android.os.Parcelable
import android.example.myfitnessbuddy.model.Training as Training

class KrachtTraining(naam: String, omschrijving: String) : Training(naam, omschrijving) {

    // EXTRA PROPERTIES
    private var oefeningGroepen: MutableList<KrachtOefeningGroep>

    // INITIALIZATION
    init{
        this.oefeningGroepen = mutableListOf<KrachtOefeningGroep>()
    }

    // GETTERS
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