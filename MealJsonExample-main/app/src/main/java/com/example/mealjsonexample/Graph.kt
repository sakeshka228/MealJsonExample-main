package com.example.mealjsonexample

object Graph {
    val mainScreen: Screen = Screen("MainScreen")
    val secondScreen: Screen = Screen("SecondScreen")
    val dishScreen: Screen = Screen("DishScreen")
    val mealDetailsScreen: Screen = Screen("MealDetailsScreen")
}

data class Screen(
    val route: String,
)