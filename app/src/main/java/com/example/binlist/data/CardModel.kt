package com.example.binlist.data

data class CardModel(
    val bin : Int?= null,
    val scheme : String?= null,
    val brand : String?= null,
    val cardNumber : Long?= null,
    val type : String?= null,
    val prepaid : Boolean?= null,
    val country : String?= null,
    val bank : String?= null
)
