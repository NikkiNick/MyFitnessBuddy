package android.example.myfitnessbuddy.activities

import android.content.Intent
import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.ActivityAddTrainingBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class AddTrainingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddTrainingBinding

    // ONCREATE
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // BINDING LAYOUT
        binding = DataBindingUtil.setContentView<ActivityAddTrainingBinding>(this, R.layout.activity_add_training)

        // NAVIGATE UP
        val navController = this.findNavController(R.id.myNavHost);
        NavigationUI.setupActionBarWithNavController(this, navController)

    }

    // NAVIGATE UP
    override fun onSupportNavigateUp(): Boolean {

        val navController = this.findNavController(R.id.myNavHost)
        return navController.navigateUp()

    }

}
