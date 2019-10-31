package android.example.myfitnessbuddy.fragments.AddKrachtTraining


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.FragmentAddKrachtTrainingAddOefeningGroepBinding
import androidx.databinding.DataBindingUtil

class AddKrachtTraining_AddOefeningGroep : Fragment() {

    private lateinit var binding: FragmentAddKrachtTrainingAddOefeningGroepBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // BINDING LAYOUT
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_kracht_training__add_oefening_groep, container, false)

        return this.binding.root

    }


}
