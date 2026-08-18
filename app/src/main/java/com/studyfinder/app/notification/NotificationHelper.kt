package com.studyfinder.app.notification

import android.content.Context

/**
 * Notification channel setup and builder helpers (§8).
 *
 * Only *local* notifications live here. Server-triggered push (FCM + Cloud
 * Functions) is explicitly out of scope — see §11.3.
 */
object NotificationHelper {

    const val CHANNEL_ID = "session_reminders"

    /** Called once from [com.studyfinder.app.StudyFinderApp]. */
    fun createChannel(context: Context) {
        TODO("§8")
    }

    /** "Your session starts in 30 minutes" (§8). */
    fun showSessionReminder(
        context: Context,
        sessionId: String,
        title: String,
        body: String,
    ) {
        TODO("§8")
    }
}
