package android.example.myfitnessbuddy.fragments.AddPowerTraining


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.FragmentAddPowerTrainingNameInfoBinding
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.activity_main.*

/**
 * A simple [Fragment] subclass.
 */
class AddPowerTraining_name_info : Fragment() {

    private lateinit var binding: FragmentAddPowerTrainingNameInfoBinding

    // ONCREATEVIEW
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // BINDING LAYOUT
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_power_training_name_info, container, false)

        return this.binding.root

    }


}
