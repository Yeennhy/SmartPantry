package com.studyfinder.app.ui.inbox

import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator

/** §7.8. */
class InboxViewModel : ViewModel() {

    private val inboxRepository = ServiceLocator.inboxRepository
    private val sessionRepository = ServiceLocator.sessionRepository

    fun observeInbox() {
        TODO("§7.8")
    }

    /** Accept in place — runs the invitee transaction without leaving the screen. */
    fun accept(sessionId: String, itemId: String) {
        TODO("§3.1, §7.8")
    }

    fun markRead(itemId: String) {
        TODO("§7.8")
    }
}
