package com.studyfinder.app.util

import java.time.LocalDate

/**
 * Timestamp formatting and the start/duration → endTime maths the Create
 * Session form needs (§7.4).
 *
 * minSdk is 26, so `java.time` is available without desugaring.
 */
object DateTimeUtils {

    /** "Mon 18 Aug · 14:00–16:00" for session cards and headers. */
    fun formatSessionWindow(startMillis: Long, endMillis: Long): String =
        TODO("§7.2 / §7.3")

    fun formatDate(millis: Long): String = TODO("§7.6")

    fun formatTime(millis: Long): String = TODO("§7.3")

    /** Create Session collects a start plus a duration, then stores endTime (§7.4). */
    fun endTimeFrom(startMillis: Long, durationMinutes: Int): Long =
        TODO("§7.4")

    /** Bucketing key for the calendar view (§7.6) and the activity graph (§7.7). */
    fun toLocalDate(millis: Long): LocalDate = TODO("§7.6")
}
