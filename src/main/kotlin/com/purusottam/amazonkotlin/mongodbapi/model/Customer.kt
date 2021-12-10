package com.purusottam.amazonkotlin.mongodbapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Customer(
    @Id
    var customerId: String,
    var customerName: String,
    var emailId: String,
    var phoneNumber: Long,
    var imageUrl: String,
    var address: List<Address>,
    var verified: Boolean
)