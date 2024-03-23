package com.example.rentamoto.data.model

data class RemoteResult(
    val motos: List<Moto>,
    val ok: Boolean,
    val usuario: String
)