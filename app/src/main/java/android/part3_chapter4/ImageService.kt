package android.part3_chapter4

import io.reactivex.Observable
import io.reactivex.Single
import kotlinx.coroutines.flow.Flow
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface ImageService {

    @Headers("Authorization: Client-ID ____key____")
    @GET("random")
    fun getRandomImage(): Call<ImageResponse>

    @Headers("Authorization: Client-ID ____key____")
    @GET("random")
    fun getRandomImageRx(): Single<ImageResponse>
}