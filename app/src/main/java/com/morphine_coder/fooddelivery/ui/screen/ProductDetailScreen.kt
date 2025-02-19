package com.morphine_coder.fooddelivery.ui.screen

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.morphine_coder.fooddelivery.data.ProductPreviewState
import com.morphine_coder.fooddelivery.ui.screen.components.ProductPreviewSection

/**
 * Create by jaehyeon.
 * Date: 2025. 2. 19.
 */
@Composable
fun ProductDetailScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState()
) {
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier
            .verticalScroll(scrollableState)
    ) {
        ProductPreviewSection(
            state = productPreviewState
        )
    }
}