package com.example.activida_page.ControllerNavegation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.activida_page.screen.Pagina1
import com.example.activida_page.screen.Pagina3
import com.example.activida_page.screen.Pagina4
import com.example.activida_page.screen.horizontal

@Composable
fun NavComponent() {
    val navegationController = rememberNavController()
    NavHost(navController = navegationController, startDestination = "view_1") {
        composable(route = "view_1") {
            horizontal(navegationController)
        }
        composable(route = "view_2") {
            Pagina4(navegationController)
        }
    }
}

