package com.studyfinder.app.data.repository

import com.studyfinder.app.model.InboxItem
import com.studyfinder.app.util.ActionResult
import com.studyfinder.app.util.UiState
import kotlinx.coroutines.flow.Flow

/**
 * Invites + notifications merged into one screen (§7.8).
 *
 * ⚠️ Every `send*` function here writes into **another user's** inbox
 * subcollection. That is the one cross-user write the security rules permit,
 * and it is create-only with a constrained payload (§4). If these start
 * failing with PERMISSION_DENIED, check the rules before the code.
 */
class InboxRepository {

    fun observeInbox(): Flow<UiState<List<InboxItem>>> = TODO("§7.8")

    suspend fun markRead(itemId: String): ActionResult = TODO("§7.8")

    /** Host invites someone by student ID (§7.5). */
    suspend fun sendInvite(toUid: String, sessionId: String): ActionResult = TODO("§7.5")

    /** Someone asks to join a gated session; the host is told (§7.5). */
    suspend fun sendJoinRequestNotice(toHostUid: String, sessionId: String): ActionResult =
        TODO("§7.5")

    /**
     * Client-side fan-out after an edit or cancellation — iterate the
     * session's `memberUids`, which is exactly the recipient list and is
     * already loaded (§7.5). No Cloud Function needed at this scale.
     */
    suspend fun fanOutSystemMessage(
        sessionId: String,
        recipientUids: List<String>,
        message: String,
    ): ActionResult = TODO("§7.5")
}
