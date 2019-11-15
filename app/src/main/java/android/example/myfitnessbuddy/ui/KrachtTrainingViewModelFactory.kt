package android.example.myfitnessbuddy.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class KrachtTrainingViewModelFactory() : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(KrachtTrainingViewModel::class.java)) {
            return KrachtTrainingViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")

    }
}
