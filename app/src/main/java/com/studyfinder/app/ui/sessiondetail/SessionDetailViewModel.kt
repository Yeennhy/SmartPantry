package com.studyfinder.app.ui.sessiondetail

import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator
import com.studyfinder.app.model.Session
import com.studyfinder.app.model.SessionMember
import com.studyfinder.app.model.SessionViewMode

/** §7.3. */
class SessionDetailViewModel : ViewModel() {

    private val sessionRepository = ServiceLocator.sessionRepository

    /**
     * The action button state machine from §7.3, evaluated top to bottom.
     * Keeping it as a sealed type means the fragment cannot forget a case.
     */
    sealed interface ActionState {
        /** Row 1 — opened from History. */
        data object PastView : ActionState

        /** Row 2. */
        data object Cancelled : ActionState

        /** Row 3 — I am the host. */
        data object Manage : ActionState

        /** Row 4 — I was invited (§3.1 `invited` status). */
        data object AcceptInvite : ActionState

        /** Row 5 — addition beyond the original spec, see §7.3. */
        data object Leave : ActionState

        /** Row 6. */
        data object RequestPending : ActionState

        /** Row 7. */
        data object Full : ActionState

        /** Row 8. */
        data object Join : ActionState

        /** Row 9. */
        data object RequestToJoin : ActionState
    }

    fun start(sessionId: String, viewMode: SessionViewMode) {
        TODO("§7.3")
    }

    fun resolveActionState(
        session: Session,
        myMembership: SessionMember?,
        viewMode: SessionViewMode,
    ): ActionState = TODO("§7.3 — the nine-row table, in order")

    fun join() {
        TODO("§3.1")
    }

    fun requestToJoin() {
        TODO("§3.1")
    }

    fun acceptInvite() {
        TODO("§3.1")
    }

    fun cancelRequest() {
        TODO("§7.3")
    }

    /** Confirmation dialog first; also cancels the WorkManager reminder (§7.3, §8). */
    fun leave() {
        TODO("§7.3")
    }
}
