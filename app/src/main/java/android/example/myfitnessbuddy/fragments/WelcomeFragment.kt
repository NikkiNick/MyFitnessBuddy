package android.example.myfitnessbuddy.fragments


import android.content.Intent
import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.activities.AddTrainingActivity
import android.example.myfitnessbuddy.databinding.FragmentWelcomeBinding
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

/**
 * A simple [Fragment] subclass.
 */
class WelcomeFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding

    // ONCREATE
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{

        // BINDING LAYOUT
        this.binding = DataBindingUtil.inflate(inflater, R.layout.fragment_welcome, container, false)

        // BUTTONS ONCLICKLISTENERS
        this.binding.addTrainingButton.setOnClickListener{
            var intent = Intent(getContext(), AddTrainingActivity::class.java)
            startActivity(intent)
        }

        return this.binding.root
    }

}
