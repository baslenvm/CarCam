package com.baslenvm.carcam

import android.os.Bundle
import android.support.v4.app.FragmentActivity

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().run {
            add(R.id.mainFrag,CameraFragment.newInstance(),"Camera")
            commit()
        }

    }
}
