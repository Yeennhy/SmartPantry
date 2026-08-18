package com.studyfinder.app.ui.mysessions

import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator
import com.studyfinder.app.model.Session
import java.time.LocalDate

/**
 * §7.6.
 *
 * Backed by `whereArrayContains("memberUids", uid)` — the only query that can
 * answer "which sessions did I join?", because Firestore cannot search a
 * subcollection from the parent (§3.1). Needs a composite index on
 * `memberUids` array-contains + `startTime` order.
 */
class MySessionsViewModel : ViewModel() {

    private val sessionRepository = ServiceLocator.sessionRepository

    enum class ViewType { LIST, CALENDAR }

    /**
     * Split on `endTime`, not `startTime`, so a session happening right now
     * still counts as current rather than history (§7.6).
     */
    fun observeUpcoming() {
        TODO("§7.6")
    }

    fun setViewType(type: ViewType) {
        TODO("§7.6")
    }

    /** Day-cell grid source for the calendar view. */
    fun sessionsByDate(sessions: List<Session>): Map<LocalDate, List<Session>> =
        TODO("§7.6")
}
