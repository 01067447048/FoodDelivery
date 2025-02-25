package com.morphine_coder.fooddelivery.ui.screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.morphine_coder.fooddelivery.data.ProductFlavorState
import com.morphine_coder.fooddelivery.ui.theme.AppTheme

/**
 * Create by jaehyeon.
 * Date: 2025. 2. 25.
 */
@Composable
fun FlavorSection(
    modifier: Modifier = Modifier,
    data: List<ProductFlavorState>
) {
    Column(
        modifier = modifier
    ) {
        SectionHeader(
            title = "Add More Flavor",
            emotion = "😋"
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            data.forEach { item ->
                ProductFlavorItem(
                    state = item,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}

@Composable
private fun ProductFlavorItem(
    modifier: Modifier = Modifier,
    state: ProductFlavorState,
) {
    Box(
        modifier = modifier
            .shadow(
                elevation = 10.dp,
                spotColor = Color.LightGray,
                shape = RoundedCornerShape(28.dp)
            )
            .background(
                shape = RoundedCornerShape(28.dp),
                color = AppTheme.colors.regularSurface
            )
    ) {
        Column(
            modifier = Modifier
                .padding(
                    vertical = 20.dp,
                    horizontal = 8.dp
                ),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = state.imgRes),
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.fillMaxWidth()
            )

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = state.name,
                    style = AppTheme.typography.bodySmall,
                    color = AppTheme.colors.onRegularSurface
                )

                Text(
                    text = "+${state.price}",
                    style = AppTheme.typography.bodySmall,
                    color = AppTheme.colors.onRegularSurface
                )
            }
        }
    }
}

@Composable
private fun SectionHeader(
    modifier: Modifier = Modifier,
    title: String,
    emotion: String
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = title,
            style = AppTheme.typography.titleLarge,
            color = AppTheme.colors.onBackground
        )

        Text(
            text = emotion,
            style = AppTheme.typography.titleLarge
        )
    }
}