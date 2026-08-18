package com.studyfinder.app.notification

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

/**
 * The "session starting soon" reminder (§8).
 *
 * Scheduled locally as a OneTimeWorkRequest when the user joins, cancelled by
 * unique work name when they leave (§7.3). Survives process death and needs
 * no backend at all.
 */
class ReminderWorker(
    context: Context,
    params: WorkerParameters,
) : CoroutineWorker(context, params) {

    override suspend fun doWork(): Result = TODO("§8")

    companion object {
        const val KEY_SESSION_ID = "sessionId"

        /** Unique work name, so scheduling twice replaces rather than duplicates. */
        fun workName(sessionId: String): String = "reminder_$sessionId"

        fun schedule(context: Context, sessionId: String, startTimeMillis: Long) {
            TODO("§8")
        }

        fun cancel(context: Context, sessionId: String) {
            TODO("§7.3 — on leave")
        }
    }
}
