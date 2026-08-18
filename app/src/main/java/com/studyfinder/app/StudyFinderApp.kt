package com.studyfinder.app

import android.app.Application
import com.studyfinder.app.notification.NotificationHelper

/**
 * Application class (§5). Wires the ServiceLocator and creates the
 * notification channel the reminder worker posts into (§8).
 */
class StudyFinderApp : Application() {

    override fun onCreate() {
        super.onCreate()
        ServiceLocator.init(this)
        NotificationHelper.createChannel(this)
    }
}
