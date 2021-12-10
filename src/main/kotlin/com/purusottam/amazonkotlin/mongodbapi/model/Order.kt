package com.purusottam.amazonkotlin.mongodbapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant
import java.util.*

@Document
data class Order(
    @Id
    var id: String,
    var customerId: String,
    var timestamp: Instant,
    var productId: String,
    var quantity: Int,
    var actualPrice: Double, // TODO actualPrice * quantity
    var purchasedPrice: Double, // TODO sellingPrice * quantity
    var deliveryDate: Date,
    var paymentId: String
)
