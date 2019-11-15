package android.example.myfitnessbuddy.model

import android.example.myfitnessbuddy.model.Training as Training

class KrachtTraining() : Training() {

    // EXTRA PROPERTIES
    private var oefeningen: MutableList<KrachtOefening>

    // INITIALIZATION
    init{
        this.oefeningen = mutableListOf<KrachtOefening>()
    }

    // GETTERS
    fun getOefeningGroepen(): List<KrachtOefening> {
        return this.oefeningen
    }

    // OTHER FUNCTIONS
    fun addOefeningGroep(oefeningGroep: KrachtOefening){
        this.oefeningen.add(oefeningGroep)
    }
    fun removeOefeningGroep(index: Int){
        this.oefeningen.removeAt(index)
    }

}