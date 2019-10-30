package android.example.myfitnessbuddy.fragments


import android.content.Intent
import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.activities.AddPowerTrainingActivity
import android.example.myfitnessbuddy.databinding.FragmentAddTrainingChooseTypeBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

/**
 * A simple [Fragment] subclass.
 */
class AddTraining_ChooseType : Fragment() {

    private lateinit var binding: FragmentAddTrainingChooseTypeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_add_training__choose_type, container, false)

        this.binding.powertrainingButton.setOnClickListener{
            var intent = Intent(getContext(), AddPowerTrainingActivity::class.java)
            startActivity(intent)
        }
        return this.binding.root
    }


}
