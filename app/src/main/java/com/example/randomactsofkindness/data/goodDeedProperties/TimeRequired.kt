package com.example.randomactsofkindness.data.goodDeedProperties

enum class TimeRequired (override val label: String) : LabeledEnum {
    SHORT ("kurz (weniger als 10 Minuten"),
    MEDIUM ("mittel (10 - 30 Minuten)"),
    LONG ("lang (mehr als 30 Minuten)")
}