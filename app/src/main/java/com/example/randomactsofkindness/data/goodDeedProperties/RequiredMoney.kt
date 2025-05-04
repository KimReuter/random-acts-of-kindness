package com.example.randomactsofkindness.data.goodDeedProperties

enum class RequiredMoney(override val label: String) : LabeledEnum {
    NO_COST ("keine zusätzlichen Kosten"),
    LOW_COST ("geringe Kosten beinhaltet"),
    MEDIUM_COST ("moderate Kosten beinhaltet"),
    HIGH_COST ("hohe Kosten beinhaltet")
}