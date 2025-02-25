package com.morphine_coder.fooddelivery.data

import androidx.annotation.DrawableRes
import com.morphine_coder.fooddelivery.R

/**
 * Create by jaehyeon.
 * Date: 2025. 2. 25.
 */
data class ProductFlavorState(
    val name: String,
    val price: String,
    @DrawableRes val imgRes: Int
)

val ProductFlavorsData = listOf(
    ProductFlavorState(
        imgRes = R.drawable.baseline_fastfood_24,
        name = "Chedeer",
        price = "$0.99"
    ),
    ProductFlavorState(
        imgRes = R.drawable.baseline_fastfood_24,
        name = "Bacon",
        price = "$0.52"
    ),
    ProductFlavorState(
        imgRes = R.drawable.baseline_fastfood_24,
        name = "Onion",
        price = "$0.28"
    )
)
