package com.test.app

import kotlin.js.Date

object Comparables {
    fun createComparableDate(): ComparableDate =
        ComparableDate(Date())
}