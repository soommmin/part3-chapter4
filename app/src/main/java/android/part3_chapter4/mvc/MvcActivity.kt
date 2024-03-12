package android.part3_chapter4.mvc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.part3_chapter4.R
import android.part3_chapter4.databinding.ActivityMvcBinding
import android.part3_chapter4.mvc.provider.ImageProvider
import coil.load
import java.lang.System.load


//mvc -> activity 안에 뷰와 컨트롤러가 전부 들어 있음
//acitivity  -> model, imageprovider 참조 하지만
//model, imageprovider은 액티비티를 알수 없음
//위 두개는 재사용이 가능하다
class MvcActivity : AppCompatActivity(), ImageProvider.Callback {


    private lateinit var binding: ActivityMvcBinding

    private val model = ImageCountModel()
    private val imageProvider = ImageProvider(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvcBinding.inflate(layoutInflater).also {
            setContentView(it.root)
            it.view = this
        }
    }




    //이미지 호출 -> override loadimage 호출
    fun loadImage() {
        imageProvider.getRandomImage()
    }

    override fun loadImage(url: String, color: String) {
        model.increase()
        with(binding) {
            imageView.run {
                setBackgroundColor(Color.parseColor(color))
                load(url)
            }
            imageCountTextView.text = "불러온 이미지 수 : ${model.count}"
        }
    }
}