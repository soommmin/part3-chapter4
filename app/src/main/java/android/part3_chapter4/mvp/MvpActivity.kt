package android.part3_chapter4.mvp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.part3_chapter4.R
import android.part3_chapter4.databinding.ActivityMvpBinding
import android.part3_chapter4.mvp.model.ImageCountModel
import android.part3_chapter4.mvp.repository.ImageRepositoryImpl
import coil.load

//activity <-> presenter 서로 참조, 일대일 구조
//서로 분리 되어 있어서 test code 가능
class MvpActivity : AppCompatActivity() ,MvpContractor.View {
    private lateinit var binding: ActivityMvpBinding
    private lateinit var presenter: MvpContractor.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvpBinding.inflate(layoutInflater).also {
            setContentView(it.root)
            it.view = this
        }

        presenter = MvpPresenter(ImageCountModel(), ImageRepositoryImpl())
        presenter.attachView(this)
    }

    override fun onDestroy() {
        presenter.detachView()
        super.onDestroy()
    }

    fun loadImage() {
        presenter.loadRandomImage()
    }

    override fun showImage(imageUrl: String, color: String) {
        binding.imageView.run {
            setBackgroundColor(Color.parseColor(color))
            load(imageUrl) {
                crossfade(300)
            }
        }
    }

    override fun showImageCountText(count: Int) {
        binding.imageCountTextView.text = "불러온 이미지 수 : $count"
    }


}