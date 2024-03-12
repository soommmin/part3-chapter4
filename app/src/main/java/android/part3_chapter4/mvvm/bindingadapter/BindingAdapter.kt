package android.part3_chapter4.mvvm.bindingadapter

import android.graphics.Color
import android.part3_chapter4.mvvm.model.Image
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load



@BindingAdapter("image")
fun ImageView.setImage(image: Image?) {
    if (image == null) {
        return
    }

    setBackgroundColor(Color.parseColor(image.color))
    load(image.url) {
        crossfade(300)
    }
}