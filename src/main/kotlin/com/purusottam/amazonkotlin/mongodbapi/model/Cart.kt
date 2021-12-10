package com.purusottam.amazonkotlin.mongodbapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Cart(
    @Id
    var id: String,
    var customerId: String,
    var cartSummery: Map<String, Int>, // TODO -> key -> productId and value quantity
    var status: Boolean
)