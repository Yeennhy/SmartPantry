package com.studyfinder.app.ui.sessioncreate

import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator

/** §7.4. */
class CreateSessionViewModel : ViewModel() {

    private val sessionRepository = ServiceLocator.sessionRepository
    private val communityRepository = ServiceLocator.communityRepository

    /** Dropdown sources, seeded per community (§3.1). */
    fun loadCourses() {
        TODO("§7.4")
    }

    fun loadCampusLocations() {
        TODO("§7.4")
    }

    /** Copies every field except date/time, which must be re-picked (§7.6). */
    fun prefillFrom(sessionId: String) {
        TODO("§7.6")
    }

    /**
     * Start time in the future, capacity >= 2, non-empty title,
     * endTime > startTime (§7.4).
     */
    fun validate(): Boolean = TODO("§7.4")

    /**
     * One WriteBatch: session document + the host's `admin` member row, with
     * `joinedCount = 1` and `memberUids = [hostUid]` already set. The rules
     * reject any other shape at creation, so this cannot be split (§7.4).
     *
     * When prefilled from a past session, also re-invites its members (§7.6).
     */
    fun submit() {
        TODO("§7.4")
    }
}
