package com.example.tugas1

import android.os.Build

actual fun getPlatform(): Platform {
    return object : Platform {
        override val name: String = "Android ${Build.VERSION.SDK_INT}"
    }
}
