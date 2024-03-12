package android.part3_chapter4.mvi.repository

import android.part3_chapter4.mvi.model.Image


interface ImageRepository {

    suspend fun getRandomImage() : Image
}