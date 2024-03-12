package android.part3_chapter4.mvvm.repository

import android.part3_chapter4.mvvm.model.Image

import io.reactivex.Single

interface ImageRepository {

    fun getRandomImage() : Single<Image>
}