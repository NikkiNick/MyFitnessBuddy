package android.example.myfitnessbuddy.activities

import android.example.myfitnessbuddy.R
import android.example.myfitnessbuddy.databinding.ActivityAddKrachtTrainingBinding
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModel
import android.example.myfitnessbuddy.ui.KrachtTrainingViewModelFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NavUtils
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders

class AddKrachtTrainingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddKrachtTrainingBinding
    private lateinit var viewModel: KrachtTrainingViewModel
    private lateinit var viewModelFactory: KrachtTrainingViewModelFactory

    // ONCREATE
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // BINDING LAYOUT
        binding = DataBindingUtil.setContentView<ActivityAddKrachtTrainingBinding>(this, R.layout.activity_add_kracht_training)

        // VIEWMODEL
        this.viewModelFactory = KrachtTrainingViewModelFactory()
        this.viewModel = ViewModelProviders.of(this, this.viewModelFactory).get(KrachtTrainingViewModel::class.java)

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
