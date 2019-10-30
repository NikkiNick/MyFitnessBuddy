package android.example.myfitnessbuddy.activities

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // ONCREATE
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // BINDING LAYOUT
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

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
