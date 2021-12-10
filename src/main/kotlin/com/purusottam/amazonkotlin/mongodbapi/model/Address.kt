package com.purusottam.amazonkotlin.mongodbapi.model

data class Address(
    var detailAddress: String,
    var city: String,
    var state: String,
    var country: String,
    var pinCode: Int
)