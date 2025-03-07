package com.morphine_coder.fooddelivery.ui.screen.components

import android.app.ActionBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.morphine_coder.fooddelivery.R
import com.morphine_coder.fooddelivery.data.ProductPreviewState
import com.morphine_coder.fooddelivery.ui.theme.AppTheme

/**
 * Create by jaehyeon.
 * Date: 2025. 2. 19.
 */
@Composable
fun ProductPreviewSection(
    modifier: Modifier = Modifier,
    state: ProductPreviewState
) {
    Box(
        modifier = modifier
            .height(IntrinsicSize.Max)

    ) {
        ProductBackground(
            modifier = Modifier
                .padding(bottom = 24.dp)
        )
        Content(
            modifier = Modifier
                .statusBarsPadding()
                .padding(top = 24.dp),
            state = state,
        )
    }
}

@Composable
private fun ProductBackground(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                color= AppTheme.colors.secondarySurface,
                shape = RoundedCornerShape(
                    bottomStart = 32.dp,
                    bottomEnd = 32.dp
                )
            )
    )
}

@Composable
private fun Content(
    modifier: Modifier = Modifier,
    state: ProductPreviewState
) {
    ConstraintLayout(
        modifier = modifier.fillMaxWidth()
    ) {
        val (actionBar, highlights, productImage) = createRefs()

        ActionBar(
            headline = state.headLine,
            modifier = Modifier
                .padding(horizontal = 18.dp)
                .constrainAs(actionBar) {
                    top.linkTo(parent.top)
                }
        )

        Image(
            painter = painterResource(R.drawable.baseline_fastfood_24),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .height(256.dp)
                .constrainAs(productImage) {
                    end.linkTo(parent.end)
                    top.linkTo(actionBar.bottom, 20.dp)
                }
        )

        ProductHighlights(
            highlights = state.highlights,
            modifier = Modifier
                .constrainAs(highlights) {
                    start.linkTo(parent.start, 19.dp)
                    top.linkTo(productImage.top)
                }
        )
    }
}

@Composable
private fun ActionBar(
    modifier: Modifier = Modifier,
    headline: String
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = headline,
            style = AppTheme.typography.headline,
            color = AppTheme.colors.onSecondarySurface
        )

        CloseButton()
    }
}


@Composable
private fun CloseButton(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .size(44.dp),
        shape = RoundedCornerShape(16.dp),
        color = AppTheme.colors.actionSurface,
        contentColor = AppTheme.colors.secondarySurface
    ){
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_close),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}