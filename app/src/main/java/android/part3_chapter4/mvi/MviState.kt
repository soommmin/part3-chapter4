package android.part3_chapter4.mvi

import android.part3_chapter4.mvi.model.Image

sealed class MviState {
    object Idle : MviState()
    object Loading : MviState()
    data class LoadedImage(val image: Image, val count: Int) : MviState()
}