package android.example.myfitnessbuddy.activities

import android.content.Intent
import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.ActivityAddTrainingBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NavUtils
import androidx.databinding.DataBindingUtil
class AddTrainingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddTrainingBinding

    // ONCREATE
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // BINDING LAYOUT
        binding = DataBindingUtil.setContentView<ActivityAddTrainingBinding>(this, R.layout.activity_add_training)

        // NAVIGATE UP TO PREVIOUS ACTIVITY
        val actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)

    }

    // NAVIGATE UP
    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true

    }

}
