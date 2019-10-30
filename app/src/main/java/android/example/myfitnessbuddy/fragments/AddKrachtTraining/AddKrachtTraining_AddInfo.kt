package android.example.myfitnessbuddy.fragments.AddKrachtTraining


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.FragmentAddKrachtTrainingAddInfoBinding
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModel
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController

class AddKrachtTraining_AddInfo : Fragment() {

    private lateinit var binding: FragmentAddKrachtTrainingAddInfoBinding
    private lateinit var viewModel: KrachtTrainingViewModel

    // ONCREATEVIEW
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // BINDING LAYOUT
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_kracht_training_add_info, container, false)

        return this.binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // BUTTON ONCLICKLISTENER
        this.binding.addInfoButton.setOnClickListener { view: View ->

            this.viewModel.setNaam(this.binding.nameEditText.text.toString())
            this.viewModel.setOmschrijving(this.binding.omschrijvingEditText.text.toString())
            Log.i("AddInfoNaam", "naam = ${this.viewModel.getNaam().value}")
            Log.i("AddInfoNaam", "omschrijving = ${this.viewModel.getOmschrijving().value}")
            view.findNavController().navigate(R.id.action_addKrachtTraining_AddInfo_to_addKrachtTraining_AddOefeningGroepen)

        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)

        // VIEWMODEL
        this.viewModel = activity?.run {
            ViewModelProviders.of(this)[KrachtTrainingViewModel::class.java]
        } ?: throw Exception("Invalid Activity")

    }
}
