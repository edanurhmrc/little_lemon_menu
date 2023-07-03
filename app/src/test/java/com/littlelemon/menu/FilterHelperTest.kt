package com.littlelemon.menu

import org.junit.Assert.*
import org.junit.Test

class FilterHelperTest{

    @Test
    fun testFilterProducts() {
        // Arrange
        val productsList = listOf(
            ProductItem("Black tea", 3.0, "Drinks", R.drawable.black_tea),
            ProductItem("Custard tart", 14.0, "Dessert", R.drawable.custard_tart),
            ProductItem("Lasagna", 15.0, "Food", R.drawable.lasagna),
            ProductItem("Croissant", 7.0, "Dessert", R.drawable.croissant),
            ProductItem("Green tea", 3.0, "Drinks", R.drawable.green_tea),
            ProductItem("Salmon en papillote", 25.0, "Food", R.drawable.salmon_en_papillote),
        )
        val filterHelper = FilterHelper()

        // Act
        val filteredListAll = filterHelper.filterProducts(FilterType.All, productsList)
        val filteredListDrinks = filterHelper.filterProducts(FilterType.Drinks, productsList)
        val filteredListFood = filterHelper.filterProducts(FilterType.Food, productsList)
        val filteredListDessert = filterHelper.filterProducts(FilterType.Dessert, productsList)

        // Assert
        assertEquals(productsList, filteredListAll)
        assertEquals(2, filteredListDrinks.size)
        assertEquals(2, filteredListFood.size)
        assertEquals(2, filteredListDessert.size)
        assertEquals("Drinks", filteredListDrinks[0].category)
        assertEquals("Drinks", filteredListDrinks[1].category)
        assertEquals("Food", filteredListFood[0].category)
        assertEquals("Food", filteredListFood[1].category)
        assertEquals("Dessert", filteredListDessert[0].category)
        assertEquals("Dessert", filteredListDessert[1].category)
    }
}