package com.morphine_coder.fooddelivery.data

/**
 * Create by jaehyeon.
 * Date: 2025. 2. 25.
 */
data class ProductNutritionState(
    val calories: Calories,
    val nutrition: List<NutritionState>
)

data class Calories(
    val value: String,
    val unit: String
)

data class NutritionState(
    val amount: String,
    val unit: String,
    val title: String
)

val ProductNutritionData = ProductNutritionState(
    calories = Calories(
        value = "650",
        unit = "Cal"
    ),
    nutrition = listOf(
        NutritionState(
            amount = "25",
            unit = "g",
            title = "Protein"
        ),
        NutritionState(
            amount = "50",
            unit = "g",
            title = "Total Carbs (16% DV)"
        ),
        NutritionState(
            amount = "10",
            unit = "g",
            title = "Total Fat (45% DV)"
        )
    )
)
