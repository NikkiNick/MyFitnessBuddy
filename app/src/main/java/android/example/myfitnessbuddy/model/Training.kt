package android.example.myfitnessbuddy.model

abstract class Training(){
     private var _naam: String = ""
     private var _omschrijving: String = ""

    fun setNaam(naam: String){
        this._naam = naam;
    }
    fun setOmschrijving(omschrijving: String){
        this._omschrijving = omschrijving
    }
    fun getNaam(): String{
        return this._naam
    }
    fun getOmschrijving(): String{
        return this._omschrijving
    }

}

