package com.safeto.safeto

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class Pebble : WearableActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pebble)

        // Enables Always-on
        setAmbientEnabled()
    }
}
