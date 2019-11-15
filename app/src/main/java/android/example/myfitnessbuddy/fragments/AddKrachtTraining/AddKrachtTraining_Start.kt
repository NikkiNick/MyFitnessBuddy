package android.example.myfitnessbuddy.fragments.AddKrachtTraining


import android.os.Bundle
import androidx.fragment.app.Fragment

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.FragmentAddKrachtTrainingAddInfoBinding
import android.example.myfitnessbuddy.databinding.FragmentAddKrachtTrainingStartBinding
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModel
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModelFactory
import android.util.Log
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

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

        this.binding.krachtTraining = this.viewModel
        this.binding.setLifecycleOwner(this.activity)

        this.binding.addKrachtOefeningButton.setOnClickListener {
            view!!.findNavController().navigate(AddKrachtTraining_StartDirections.actionAddKrachtTrainingStartToAddKrachtTrainingAddExcercise())
        }

        setHasOptionsMenu(true)

        return this.binding.root

    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_add_krachttraining__start, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }

}
