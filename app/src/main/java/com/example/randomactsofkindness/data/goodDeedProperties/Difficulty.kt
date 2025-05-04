package com.example.randomactsofkindness.data.goodDeedProperties

enum class Difficulty(override val label: String) : LabeledEnum {
    EASY ("einfach"),
    MEDIUM ("mittel"),
    HARD ("schwer");
}

interface LabeledEnum {
    val label: String
}