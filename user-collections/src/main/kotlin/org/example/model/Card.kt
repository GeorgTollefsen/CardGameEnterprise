package org.example.model



data class Card(
    val cardId : String,
    val rarity: Rarity
){

    constructor(dto: CardDto): this(
        dto.cardId ?: throw IllegalArgumentException("Null cardId"),
        dto.rarity ?: throw IllegalArgumentException("Null rarity"))
}