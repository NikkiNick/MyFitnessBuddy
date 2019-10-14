package android.example.myfitnessbuddy

import android.example.myfitnessbuddy.R.*
import android.example.myfitnessbuddy.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        //binding layout
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        drawerLayout = binding.navDrawerLayout

        //add navigate - UP Support
        val navController = this.findNavController(R.id.myNavHost);
        NavigationUI.setupActionBarWithNavController(this, navController, drawerLayout)
        NavigationUI.setupWithNavController(binding.navView, navController)

    }

    // NavigateUP functionality
    override fun onSupportNavigateUp(): Boolean {

        val navController = this.findNavController(R.id.myNavHost)
        return NavigationUI.navigateUp(navController, drawerLayout)

    }
}
