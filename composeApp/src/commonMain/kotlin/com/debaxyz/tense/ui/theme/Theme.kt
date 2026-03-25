package com.debaxyz.tense.ui.theme

//import android.os.Build
import androidx.compose.foundation.*

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.*

private val DarkColorScheme = darkColorScheme(
   // primary = primaryDark,
  //  secondary = secondaryDark,
  //  tertiary = tertiaryDark,
  //  secondaryContainer = containerColorDark
)

private val LightColorScheme = lightColorScheme(
   // primary = primaryLight,
  //  secondary = secondaryLight,
  //  tertiary = tertiaryLight,
  //  secondaryContainer = containerColorLight
)


@Composable
fun TenseAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
       // dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
          //  val context = LocalContext.current
           // if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
       // }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    
    MaterialTheme(
        colorScheme = colorScheme,
      //  typography = Typography,
        content = content
    )
}