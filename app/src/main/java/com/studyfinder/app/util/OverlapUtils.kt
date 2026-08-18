package com.studyfinder.app.util

import com.studyfinder.app.model.BusyInterval
import com.studyfinder.app.model.Session

/**
 * "Auto-hide sessions that overlap with availability" (§7.2).
 *
 * Availability is modelled as a list of [BusyInterval] so that device-calendar
 * import (§11.1), if it is ever built, becomes a pure addition to the list
 * with no screen changes at all.
 */
object OverlapUtils {

    /** True when [session] collides with anything the user is already busy with. */
    fun overlapsAny(session: Session, busy: List<BusyInterval>): Boolean =
        TODO("§7.2 — half-open interval test, see BusyInterval.overlaps")

    /** Joined sessions are the only source of busy intervals in the core plan. */
    fun busyIntervalsFrom(joinedSessions: List<Session>): List<BusyInterval> =
        TODO("§7.2")
}
