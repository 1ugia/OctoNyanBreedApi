package com.example.nyanbreenapi

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


/*
This is the base application class where all Dagger components will be generated either
manually or automatically as is the case for everything in this app
Could have some field injection or re-injection but currently no use for it.
 */
@HiltAndroidApp
// pulls out the Hilt Dagger quicker from the files. without it, you'd have to manually cal it.
class NyanBreedApiApplication: Application() {
}