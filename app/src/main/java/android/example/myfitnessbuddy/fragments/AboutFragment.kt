package android.example.myfitnessbuddy.fragments

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.FragmentAboutBinding
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        this.binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_about, container, false)

        return this.binding.root

    }


}
