package com.purusottam.amazonkotlin.mongodbapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Product(
    @Id
    var productId: String,
    var productName: String,
    var productDescription: String,
    var productActualPrice: Double, // TODO actual price of the product
    var sellingPrice: Double, // TODO price after offer
    var imageUrls: List<String>,
    var brand: String,
    var color: String
)