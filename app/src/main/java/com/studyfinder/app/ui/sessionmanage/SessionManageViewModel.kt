package com.studyfinder.app.ui.sessionmanage

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator
import com.studyfinder.app.model.Session

/** §7.5. */
class SessionManageViewModel : ViewModel() {

    private val sessionRepository = ServiceLocator.sessionRepository
    private val inboxRepository = ServiceLocator.inboxRepository

    fun start(sessionId: String) {
        TODO("§7.5")
    }

    /** Only meaningful for gated sessions; hide the whole section otherwise. */
    fun observePendingRequests() {
        TODO("§7.5")
    }

    fun approve(uid: String) {
        TODO("§7.5")
    }

    fun reject(uid: String) {
        TODO("§7.5")
    }

    /**
     * Same transaction as a member leaving, run by the host (§3.1).
     * Writes a `system` inbox item to the removed user — otherwise the session
     * just vanishes from their My Sessions with no explanation.
     */
    fun removeMember(uid: String) {
        TODO("§7.5")
    }

    /**
     * Edits to **time** or **location** fan out a system inbox item to every
     * accepted member. Iterate `memberUids`, which is already loaded and is
     * exactly the recipient list (§7.5).
     */
    fun saveEdits(session: Session) {
        TODO("§7.5")
    }

    /** Sets status = cancelled and fans out. Never deletes the document (§7.5). */
    fun cancelSession() {
        TODO("§7.5")
    }

    /** ACTION_OPEN_DOCUMENT -> Storage -> append to materialUrls (§7.5). */
    fun attachMaterial(uri: Uri) {
        TODO("§7.5")
    }
}
