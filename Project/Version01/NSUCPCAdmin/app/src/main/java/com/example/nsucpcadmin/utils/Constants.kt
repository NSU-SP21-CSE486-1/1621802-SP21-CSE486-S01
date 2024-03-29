package com.example.nsucpcadmin.utils

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.webkit.MimeTypeMap

object Constants {

    // user permissions
    const val READ_STORAGE_PERMISSION_CODE = 2
    const val PICK_IMAGE_REQUEST_CODE = 2

    // Firebase constants
    // admin user collection
    const val USER: String = "Admin"
    const val NSU_CPC_ADMIN_PREFERENCES: String = "NSU_CPC_Admin_Prefs"
    const val LOGGED_IN_USERNAME: String = "logged_in_username"
    const val EXTRA_USER_DETAILS: String = "extra_user_details"
    const val MALE: String = "Male"
    const val FEMALE: String = "Female"
    const val MOBILE: String = "mobile"
    const val GENDER: String = "gender"
    const val PRESENT_ADDRESS: String = "present_address"
    const val USER_PROFILE_IMAGE: String = "user_profile_image"
    const val IMAGE: String = "image"
    const val COMPLETE_PROFILE:String = "profileCompleted"
    const val NAME: String = "name"


    /*
    * Function for choose image form phone storage
     */

    fun showImageChooser(activity: Activity) {
        // intent for image selection
        val galleryIntent = Intent(
            Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        )
        // lunches the image selection of phone storage
        activity.startActivityForResult(galleryIntent, PICK_IMAGE_REQUEST_CODE)
    }

    /*
    * Function to get image file extension of selected image
     */

    fun getFileExtension(activity: Activity, uri: Uri?): String? {
        return MimeTypeMap.getSingleton()
            .getExtensionFromMimeType(activity.contentResolver.getType(uri!!))
    }

}