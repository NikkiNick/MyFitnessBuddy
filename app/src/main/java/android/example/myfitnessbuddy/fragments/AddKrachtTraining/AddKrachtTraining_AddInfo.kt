package android.example.myfitnessbuddy.fragments.AddKrachtTraining


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.FragmentAddKrachtTrainingAddInfoBinding
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModel
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModelFactory
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
        Log.i("AddInfo", "createview")
        // BINDING LAYOUT
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_kracht_training_add_info, container, false)

        // VIEWMODEL
        this.viewModel = ViewModelProviders.of(activity!!).get(KrachtTrainingViewModel::class.java)
        this.binding.setLifecycleOwner(this.activity)

        // BUTTON ONCLICKLISTENER
        this.binding.addInfoButton.setOnClickListener { view: View ->

            this.viewModel.setNaam(this.binding.nameEditText.text.toString())
            this.viewModel.setOmschrijving(this.binding.omschrijvingEditText.text.toString())
            view.findNavController().navigate(AddKrachtTraining_AddInfoDirections.actionAddKrachtTrainingAddInfoToAddKrachtTrainingStart())

        }
        // SET ACTIONBAR TITLE
        activity?.actionBar?.setTitle(R.string.information)
        return this.binding.root

    }

    override fun onStart() {
        super.onStart()
        if(this.viewModel != null){
            this.binding.nameEditText.setText(this.viewModel.getNaam())
            this.binding.omschrijvingEditText.setText(this.viewModel.getOmschrijving())
        }

    }
}
