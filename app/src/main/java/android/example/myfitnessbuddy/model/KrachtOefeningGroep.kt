package android.example.myfitnessbuddy.model

class KrachtOefeningGroep {

    private var oefeningen: MutableList<KrachtOefening>

    init{
        this.oefeningen = mutableListOf<KrachtOefening>()
    }

    // GETTERS
    fun getOefeningen(): List<KrachtOefening>{
        return this.oefeningen
    }

    // OTHER FUNCTIONS
    fun addOefening(oefening: KrachtOefening){
        this.oefeningen.add(oefening)
    }
    fun removeOefening(index: Int){
        this.oefeningen.removeAt(index)
    }
}