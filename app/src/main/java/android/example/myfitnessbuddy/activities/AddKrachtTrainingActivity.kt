package android.example.myfitnessbuddy.activities

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.ActivityAddKrachtTrainingBinding
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class AddKrachtTrainingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddKrachtTrainingBinding
    private lateinit var viewModel: KrachtTrainingViewModel

    // ONCREATE
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // BINDING LAYOUT
        binding = DataBindingUtil.setContentView<ActivityAddKrachtTrainingBinding>(this, R.layout.activity_add_kracht_training)

        // VIEWMODEL
        this.viewModel = ViewModelProviders.of(this).get(KrachtTrainingViewModel::class.java)

        // NAVIGATE UP
        val navController = this.findNavController(R.id.myNavHost)
        NavigationUI.setupActionBarWithNavController(this, navController)

    }

    // NAVIGATE UP
    override fun onSupportNavigateUp(): Boolean {

        val navController = this.findNavController(R.id.myNavHost)
        return navController.navigateUp()

    }
}
