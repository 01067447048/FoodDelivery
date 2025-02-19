package com.morphine_coder.fooddelivery.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.morphine_coder.fooddelivery.R

/**
 * Create by jaehyeon.
 * Date: 2025. 2. 19.
 */

private val PretendardFontFamily = FontFamily(
    Font(R.font.pretendard_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.pretendard_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.pretendard_light, FontWeight.Light, FontStyle.Normal),
)

@Immutable
data class AppTypography(
    val headline: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val body: TextStyle,
    val bodySmall: TextStyle,
    val label: TextStyle,
)

val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        headline = TextStyle.Default,
        titleLarge = TextStyle.Default,
        titleMedium = TextStyle.Default,
        titleSmall = TextStyle.Default,
        body = TextStyle.Default,
        bodySmall = TextStyle.Default,
        label = TextStyle.Default,
    )
}

val extendedTypography = AppTypography(
    headline = TextStyle(
        fontFamily = PretendardFontFamily,
        fontSize = 32.sp,
        fontWeight = FontWeight.Normal,
    ),
    titleLarge = TextStyle(
        fontFamily = PretendardFontFamily,
        fontSize = 24.sp,
        fontWeight = FontWeight.Normal,
    ),
    titleMedium = TextStyle(
        fontFamily = PretendardFontFamily,
        fontSize = 20.sp,
        fontWeight = FontWeight.Normal,
    ),
    titleSmall = TextStyle(
        fontFamily = PretendardFontFamily,
        fontSize = 16.sp,
        fontWeight = FontWeight.Normal,
    ),
    body = TextStyle(
        fontFamily = PretendardFontFamily,
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
    ),
    bodySmall = TextStyle(
        fontFamily = PretendardFontFamily,
        fontSize = 12.sp,
        fontWeight = FontWeight.Normal,
    ),
    label = TextStyle(
        fontFamily = PretendardFontFamily,
        fontSize = 11.sp,
        fontWeight = FontWeight.Light,
    ),
)