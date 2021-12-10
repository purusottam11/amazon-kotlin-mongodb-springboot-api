package com.purusottam.amazonkotlin.mongodbapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Inventory(
    @Id
    var id: String,
    var productId: String,
    var sellerId: String,
    var quality: Int,
    var city: String,
    var isOutOfStock: Boolean
)