package com.atilsamancioglu.kotlinlandmarkbook

import android.graphics.Bitmap


object MySingleton {
    var mySelectedImage : Bitmap? = null
}


class Singleton {

    companion object Selected {
        var selectedImage : Bitmap? = null
    }

}