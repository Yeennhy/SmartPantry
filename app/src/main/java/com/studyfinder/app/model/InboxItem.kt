package com.studyfinder.app.model

/**
 * `users/{uid}/inbox/{itemId}` (§3.1) — invites and notifications merged into
 * one screen (§7.8).
 *
 * Cross-user creation of these documents is the one place the security rules
 * grant a write outside your own subtree, which is what makes invite /
 * approve / edit / cancel fan-out work without a Cloud Function (§4, §7.5).
 */
data class InboxItem(
    val id: String = "",
    val type: InboxType = InboxType.SYSTEM,
    /** Null for pure system messages with no session attached. */
    val sessionId: String? = null,
    val fromUid: String? = null,
    val message: String = "",
    val read: Boolean = false,
    val createdAtMillis: Long = 0L,
) {
    /** Invite rows carry two buttons — Accept and Details (§7.8). */
    val isActionable: Boolean get() = type == InboxType.INVITE && sessionId != null
}
