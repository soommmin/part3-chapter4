package android.part3_chapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.part3_chapter4.databinding.ActivityMainBinding
import android.part3_chapter4.mvc.MvcActivity
import android.part3_chapter4.mvp.MvpActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
            it.view = this
        }

    }

    fun openMvc() {
        startActivity(Intent(this, MvcActivity::class.java))
    }

    fun openMvp() {
        startActivity(Intent(this, MvpActivity::class.java))
    }

    fun openMvvm() {
       // startActivity(Intent(this, MvvmActivity::class.java))
    }

    fun openMvi() {
       // startActivity(Intent(this, MviActivity::class.java))
    }
}