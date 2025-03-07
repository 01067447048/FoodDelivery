package com.morphine_coder.fooddelivery.ui.screen

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.morphine_coder.fooddelivery.data.ProductFlavorState
import com.morphine_coder.fooddelivery.data.ProductFlavorsData
import com.morphine_coder.fooddelivery.data.ProductNutritionData
import com.morphine_coder.fooddelivery.data.ProductNutritionState
import com.morphine_coder.fooddelivery.data.ProductPreviewState
import com.morphine_coder.fooddelivery.ui.screen.components.FlavorSection
import com.morphine_coder.fooddelivery.ui.screen.components.ProductNutritionSection
import com.morphine_coder.fooddelivery.ui.screen.components.ProductPreviewSection

/**
 * Create by jaehyeon.
 * Date: 2025. 2. 19.
 */
@Composable
fun ProductDetailScreen(
    modifier: Modifier = Modifier,
    productPreviewState: ProductPreviewState = ProductPreviewState(),
    productFlavors: List<ProductFlavorState> = ProductFlavorsData,
    productNutritionState: ProductNutritionState = ProductNutritionData
) {
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier
            .verticalScroll(scrollableState)
    ) {
        ProductPreviewSection(
            state = productPreviewState
        )

        Spacer(modifier = Modifier.height(16.dp))

        FlavorSection(
            modifier = Modifier
                .padding(horizontal = 18.dp),
            data = productFlavors
        )

        Spacer(modifier = Modifier.height(16.dp))

        ProductNutritionSection(
            modifier = Modifier.padding(horizontal = 18.dp),
            state = productNutritionState
        )
    }
}