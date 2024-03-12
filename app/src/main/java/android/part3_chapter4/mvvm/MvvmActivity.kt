package android.part3_chapter4.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.part3_chapter4.R
import android.part3_chapter4.databinding.ActivityMvvmBinding
import android.part3_chapter4.mvvm.repository.ImageRepositoryImpl
import androidx.activity.viewModels

class MvvmActivity : AppCompatActivity() {
    private val viewModel: MvvmViewModel by viewModels {
        MvvmViewModel.MvvmViewModelFactory(ImageRepositoryImpl())
    }

    private lateinit var binding: ActivityMvvmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvvmBinding.inflate(layoutInflater).also {
            setContentView(it.root)
            it.lifecycleOwner = this
            it.view = this
            it.viewModel = viewModel
        }
    }

    fun loadImage() {
        viewModel.loadRandomImage()
    }
}