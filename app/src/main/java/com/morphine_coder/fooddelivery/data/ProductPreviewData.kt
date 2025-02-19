package com.morphine_coder.fooddelivery.data

import androidx.annotation.DrawableRes
import com.morphine_coder.fooddelivery.R

/**
 * Create by jaehyeon.
 * Date: 2025. 2. 19.
 */
data class ProductHighlightState(
    val text: String,
    val type: ProductHighlightType,
)

enum class ProductHighlightType {
    PRIMARY,
    SECONDARY
}

data class ProductPreviewState(
    val headLine: String = "Mr. Cheezy",
    @DrawableRes val productImage: Int = R.drawable.baseline_fastfood_24,
    val highlights: List<ProductHighlightState> = listOf(
        ProductHighlightState(
            text = "Classic taste",
            type = ProductHighlightType.SECONDARY
        ),
        ProductHighlightState(
            text = "Bestseller",
            type = ProductHighlightType.PRIMARY
        ),
    )
)