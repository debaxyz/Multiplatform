package com.debaxyz.tense

import androidx.compose.animation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import com.debaxyz.tense.screen.PresentScreen
import com.debaxyz.tense.screen.PastScreen
import com.debaxyz.tense.screen.FutureScreen
import androidx.compose.ui.unit.dp
import com.debaxyz.tense.ui.theme.*
// ── Data ─────────────────────────────────────────────────────────────────────

private data class NavItem(
    val screen: Screen,
    val label: String,
    val icon: ImageVector
)

private val navItems = listOf(
    NavItem(Screen.PRESENT, "Present", Icons.Default.Home),
    NavItem(Screen.PAST, "Past", Icons.Default.Person),
    NavItem(Screen.FUTURE, "Future", Icons.Default.Star)
)

// ── Root App ─────────────────────────────────────────────────────────────────

@Composable
fun App() {
       TenseAppTheme{
     AppScaffold()
  }
         
}

// ── Scaffold ─────────────────────────────────────────────────────────────────

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppScaffold() {
    // Stack of screens — push to navigate forward, pop to go back
    var backStack by remember { mutableStateOf(listOf(Screen.PRESENT)) }

    val currentScreen = backStack.last()
   // val canGoBack = backStack.size > 1

    fun navigate(screen: Screen) {
        if (screen != currentScreen) {
            backStack = backStack + screen
        }
    }
/*
    fun navigateBack() {
        if (canGoBack) backStack = backStack.dropLast(1)
    }
*/
    Scaffold(
        topBar = {
            TopAppBar(modifier = Modifier.fillMaxWidth().padding(start=16.dp,end=16.dp),
                title = {
                    Text(
                        text = when (currentScreen) {
                            Screen.PRESENT -> "Present"
                            Screen.PAST -> "Past"
                            Screen.FUTURE -> "Future"
                        },
                        fontWeight = FontWeight.SemiBold
                    )
                },
                navigationIcon = { 
                
                    FilledTonalIconButton(onClick = { /* handle back */},
                          modifier = Modifier.size(35.dp)) {
                        
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            modifier = Modifier.size(17.dp) // Custom icon size
                      
                            
                        )
                    }
                    Spacer(modifier = Modifier.width(50.dp))  
                },
                actions = {
              //  val context = LocalContext.current
                    FilledTonalIconButton(onClick = {/* handle back */ /*context.startActivity(Intent(context, SecondActivity::class.java))*/ },
                          modifier = Modifier.size(35.dp)) {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = "Settings",
                            modifier = Modifier.size(17.dp) // Custom icon size
                            
                        )
                    }
                },
                /*
                colors = TopAppBarDefaults.topAppBarColors(
                
                    containerColor = MaterialTheme.colorScheme.surface,
                    titleContentColor = MaterialTheme.colorScheme.onSurface,
                    navigationIconContentColor = MaterialTheme.colorScheme.onSurface
                )
                */
            )
        },
        bottomBar = {
            ShortNavigationBar {
                navItems.forEach { item ->
                    ShortNavigationBarItem(
                        selected = currentScreen == item.screen,
                        onClick = {
                            // Tap on nav bar resets the back-stack to that root screen
                            backStack = listOf(item.screen)
                        },
                        icon = {
                            Icon(
                                imageVector = item.icon,
                                contentDescription = item.label
                            )
                        },
                        label = { Text(item.label) }
                    )
                }
            }
        }
    ) { innerPadding ->
        AnimatedContent(
            targetState = currentScreen,
            transitionSpec = {
                (slideInHorizontally { it } + fadeIn())
                    .togetherWith(slideOutHorizontally { -it } + fadeOut())
            },
            modifier = Modifier.padding(innerPadding),
            label = "screen_transition"
        ) { screen ->
            when (screen) {
                Screen.PRESENT -> PresentScreen()
                Screen.PAST -> PastScreen()
                Screen.FUTURE -> FutureScreen()
            }
        }
    }
}
