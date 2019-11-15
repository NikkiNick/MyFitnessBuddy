package android.example.myfitnessbuddy.fragments.AddKrachtTraining


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.FragmentAddKrachtTrainingAddInfoBinding
import android.example.myfitnessbuddy.databinding.FragmentAddKrachtTrainingStartBinding
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModel
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModelFactory
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController

/**
 * A simple [Fragment] subclass.
 */
class AddKrachtTraining_Start : Fragment() {

    private lateinit var binding: FragmentAddKrachtTrainingStartBinding
    private lateinit var viewModel: KrachtTrainingViewModel
    private lateinit var viewModelFactory: KrachtTrainingViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // BINDING LAYOUT
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_kracht_training__start, container, false)

        this.viewModel = ViewModelProviders.of(activity!!).get(KrachtTrainingViewModel::class.java)

        this.binding.addKrachtOefeningButton.setOnClickListener {

        }

        this.binding.krachtTraining = this.viewModel
        this.binding.setLifecycleOwner(this)



        return this.binding.root

    }


}
