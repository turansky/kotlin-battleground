package com.test.yfiles

import kotlin.js.Date

private class ComparableDate(
    private val date: Date
) : ComparableBase<ComparableDate>() {
    override fun compareTo(other: ComparableDate): Int {
        return (date.getTime() - other.date.getTime()).toInt()
    }
}