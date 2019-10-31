package android.example.myfitnessbuddy.fragments.AddKrachtTraining

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.FragmentAddKrachtTrainingAddOefeningGroepenBinding
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModel
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController

class AddKrachtTraining_AddOefeningGroepen : Fragment() {

    private lateinit var binding: FragmentAddKrachtTrainingAddOefeningGroepenBinding
    private lateinit var viewModel: KrachtTrainingViewModel

    // ONCREATEVIEW
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // BINDING LAYOUT
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_kracht_training__add_oefening_groepen, container, false)

        // BUTTON ONCLICKLISTENERS
        this.binding.addKrachtOefeningGroepButton.setOnClickListener{view: View ->
            view.findNavController().navigate(R.id.action_addKrachtTraining_AddOefeningGroepen_to_addKrachtTraining_AddOefeningGroep)
        }

        // SET ACTIONBAR TITLE
        activity?.actionBar?.setTitle(this.viewModel.getNaam().toString())

        return this.binding.root

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)

        // VIEWMODEL
        this.viewModel = activity?.run {
            ViewModelProviders.of(this).get(KrachtTrainingViewModel::class.java)
        } ?: throw Exception("Invalid Activity")
        this.binding.naamText.text = this.viewModel.getNaam().value.toString()
        this.binding.omschrijvingText.text = this.viewModel.getOmschrijving().value.toString()

    }

}
