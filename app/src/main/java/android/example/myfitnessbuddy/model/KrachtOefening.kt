package android.example.myfitnessbuddy.model

class KrachtOefening {

    private lateinit var naam: String
    private lateinit var omschrijving: String
    private var spiergroepen: MutableList<Spiergroep>
    private var aantalSets: Int

    init{
        this.spiergroepen = mutableListOf<Spiergroep>()
        this.aantalSets = 0
    }

    // CONSTRUCTOR
    constructor(naam: String, omschrijving: String, spiergroepen: MutableList<Spiergroep>, aantalSets: Int){
        setNaam(naam)
        setOmschrijving(omschrijving)
        setSpiergroepen(spiergroepen)
        setAantalSets(aantalSets)
    }

    // SETTERS
    private fun setNaam(naam: String){
        this.naam = naam
    }
    private fun setOmschrijving(omschrijving: String){
        this.omschrijving = omschrijving
    }
    private fun setSpiergroepen(spiergroepen: List<Spiergroep>){
        this.spiergroepen.addAll(spiergroepen)
    }
    private fun setAantalSets(aantalSets: Int){
        this.aantalSets = aantalSets
    }

    // GETTERS
    fun getNaam(): String{
        return this.naam
    }
    fun getOmschrijving(): String{
        return this.omschrijving
    }
    fun getSpiergroepen(): List<Spiergroep> {
        return this.spiergroepen
    }
    fun getAantalSets(): Int{
        return this.aantalSets
    }
}