package com.test.app

import com.test.yfiles.ComparableBase
import kotlin.js.Date

class ComparableDate(
    private val date: Date
) : ComparableBase<ComparableDate>() {
    override fun compareTo(other: ComparableDate): Int {
        return (date.getTime() - other.date.getTime()).toInt()
    }
}