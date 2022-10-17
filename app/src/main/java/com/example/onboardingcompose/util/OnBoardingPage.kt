package com.example.onboardingcompose.util

import androidx.annotation.DrawableRes
import com.example.onboardingcompose.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
) {
    object First : OnBoardingPage(
        image = R.drawable.first,
        title = "Stronger security with Google Authenticator",
        description = "Get verification codes for all your accounts using 2-Step Verification"
    )

    object Second : OnBoardingPage(
        image = R.drawable.second,
        title = "Simple setup using your camera",
        description = "To setup an account, you'll scan the QR code in your 2-Step Verification settings for Google or any third-party service"
    )

    object Third : OnBoardingPage(
        image = R.drawable.third,
        title = "A unique code used to sign in",
        description = "When using 2-Step Verification, you'll enter your password and a code from this app"
    )
}
