package com.example.randomactsofkindness.data

import java.util.UUID

data class Reason(
    val id: UUID = UUID.randomUUID(),
    val text: String
)
