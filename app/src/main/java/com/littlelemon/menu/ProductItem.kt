package com.littlelemon.menu

import androidx.annotation.DrawableRes

data class ProductItem(
    val title: String,
    val price: Double,
    val category: String,
    @DrawableRes val image: Int
):java.io.Serializable

data class Products(val items: List<ProductItem>)