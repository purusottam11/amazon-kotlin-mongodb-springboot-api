package com.purusottam.amazonkotlin.mongodbapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Seller(
    @Id
    var sellerId: String,
    var sellerName: String,
    var emailId: String,
    var phoneNumber: Long,
    var imageUrl: String,
    var address: Address,
    var verified: Boolean
)