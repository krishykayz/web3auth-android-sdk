package com.openlogin.core.types

import android.content.Context
import android.net.Uri
import com.openlogin.core.OpenLogin

data class OpenLoginOptions (
    val context: Context,
    val clientId: String,
    val network: OpenLogin.Network,
    val redirectUrl: Uri? = null,
    val sdkUrl: String = "https://sdk.openlogin.com",
)