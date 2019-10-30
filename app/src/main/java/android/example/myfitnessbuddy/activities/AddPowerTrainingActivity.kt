package android.example.myfitnessbuddy.activities

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.ActivityAddPowerTrainingBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class AddPowerTrainingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddPowerTrainingBinding

    // ONCREATE
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // BINDING LAYOUT
        binding = DataBindingUtil.setContentView<ActivityAddPowerTrainingBinding>(this, R.layout.activity_add_power_training)

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
