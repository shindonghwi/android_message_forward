package dh.apps.resource

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.ViewCompat

val lightColorTheme = lightColorScheme(
    primary = Primary_50, onPrimary = White_100, primaryContainer = Primary_90, onPrimaryContainer = Primary_10,
    secondary = Secondary_40, onSecondary = White_100, secondaryContainer = Secondary_90, onSecondaryContainer = Secondary_10,
    tertiary = Tertiary_40, onTertiary = White_100, tertiaryContainer = Tertiary_90, onTertiaryContainer = Tertiary_10,
    error = ERROR_40, onError = White_100, errorContainer = ERROR_90, onErrorContainer = ERROR_10,
    background = White_99, onBackground = Neutral_10, surface = White_99, onSurface = Neutral_10,
    surfaceVariant = Neutral_Variant_90, onSurfaceVariant = Neutral_Variant_30, outline = Neutral_Variant_50
)

val darkColorTheme = lightColorScheme(
    primary = Primary_80, onPrimary = Primary_20, primaryContainer = Primary_30, onPrimaryContainer = Primary_90,
    secondary = Secondary_80, onSecondary = Secondary_20, secondaryContainer = Secondary_30, onSecondaryContainer = Secondary_90,
    tertiary = Tertiary_80, onTertiary = Tertiary_20, tertiaryContainer = Tertiary_30, onTertiaryContainer = Tertiary_90,
    error = ERROR_80, onError = ERROR_20, errorContainer = ERROR_30, onErrorContainer = ERROR_90,
    background = White_99, onBackground = Neutral_90, surface = White_99, onSurface = Neutral_80,
    surfaceVariant = Neutral_Variant_30, onSurfaceVariant = Neutral_Variant_80, outline = Neutral_Variant_60
)

@Composable
fun Android_MessageForwardTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> darkColorTheme
        else -> lightColorTheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            (view.context as Activity).window.statusBarColor = colorScheme.primary.toArgb()
            ViewCompat.getWindowInsetsController(view)?.isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = RobotoTypography,
        content = content
    )
}