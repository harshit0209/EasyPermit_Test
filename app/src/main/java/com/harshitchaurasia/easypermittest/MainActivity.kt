package com.harshitchaurasia.easypermittest

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.harshitchaurasia.easypermissions.EasyPermit
import com.harshitchaurasia.easypermissions.InitPermissions


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //-----------------------Using EasyPermit Jugaad-------------------------------------------//
        val grantPermission: EasyPermit = InitPermissions()
        grantPermission.checkAndGetPermissions(this, arrayOf(Manifest.permission.READ_CONTACTS,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CAMERA
        ))

        // 0r
        /*
        val grantPermission: EasyPermit = InitPermissions()
        grantPermission.jugaadAllPermissionsAutomatically(this)
        */
        //-----------------------------------------------------------------------------------------//


    }
}
