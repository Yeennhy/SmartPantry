package com.studyfinder.app.data.repository

import com.studyfinder.app.model.BusyInterval
import com.studyfinder.app.model.CourseCategory
import com.studyfinder.app.model.Session
import com.studyfinder.app.model.SessionMember
import com.studyfinder.app.model.SessionStatus
import com.studyfinder.app.model.TagType
import com.studyfinder.app.util.ActionResult
import com.studyfinder.app.util.UiState
import kotlinx.coroutines.flow.Flow

/**
 * Sessions, membership and every transaction in §3.1.
 *
 * **The invariant this whole class exists to protect:** a membership change
 * writes the `members/{uid}` subcollection document *and* the parent session's
 * `joinedCount` + `memberUids` in one transaction, never one without the
 * other. The security rules in §4 enforce the same thing from the other side.
 */
class SessionRepository {

    // ---------------------------------------------------------------- reads

    /**
     * Home's list (§7.2). Unselected filters must add no clause at all rather
     * than a match-anything clause, or the composite index count explodes.
     */
    fun observeCommunitySessions(
        communityId: String,
        courseIdQuery: String? = null,
        tagType: TagType? = null,
        courseCategory: CourseCategory? = null,
    ): Flow<UiState<List<Session>>> = TODO("§7.2")

    /**
     * Live updates while Session Detail is open — this is what makes a host's
     * edit or cancellation appear without any push notification (§7.3, §8).
     */
    fun observeSession(sessionId: String): Flow<UiState<Session>> = TODO("§7.3")

    fun observeMembers(sessionId: String): Flow<UiState<List<SessionMember>>> = TODO("§7.3")

    /** My own membership row — the single read that drives the whole button state machine (§7.3). */
    fun observeMyMembership(sessionId: String): Flow<SessionMember?> = TODO("§7.3")

    /**
     * My Sessions, History, the activity graph and the overlap check all read
     * from here: `whereArrayContains("memberUids", uid)` (§7.6).
     *
     * Firestore cannot query a subcollection from the parent, so this is the
     * *only* way to answer "which sessions did I join?" — see §3.1.
     */
    fun observeMySessions(): Flow<UiState<List<Session>>> = TODO("§7.6")

    /** Pending requests for the host's management screen (§7.5). */
    fun observePendingRequests(sessionId: String): Flow<UiState<List<SessionMember>>> =
        TODO("§7.5")

    /**
     * Availability for the overlap check (§7.2). Device-calendar import
     * (§11.1) would append to this list and nothing else would change.
     */
    suspend fun getBusyIntervals(): List<BusyInterval> = TODO("§7.2")

    // -------------------------------------------------------- transactions

    /** Open session: create own member row as `accepted`, +1 counters (§3.1). */
    suspend fun joinOpenSession(sessionId: String): ActionResult = TODO("§3.1")

    /** Gated session: create own member row as `pending`, counters untouched (§3.1). */
    suspend fun requestToJoin(sessionId: String): ActionResult = TODO("§3.1")

    /** Withdraw a pending request — counters untouched, it never entered them. */
    suspend fun cancelJoinRequest(sessionId: String): ActionResult = TODO("§7.3")

    /** `invited` -> `accepted` on my own row, +1 counters (§3.1, §7.3 row 4). */
    suspend fun acceptInvite(sessionId: String): ActionResult = TODO("§3.1")

    /** Host promotes `pending` -> `accepted`, +1 counters, writes an inbox item (§7.5). */
    suspend fun approveRequest(sessionId: String, uid: String): ActionResult = TODO("§7.5")

    /** Host rejects: delete the member row, counters untouched (§7.5). */
    suspend fun rejectRequest(sessionId: String, uid: String): ActionResult = TODO("§7.5")

    /**
     * Leave (self) or remove (host) — the same transaction either way, which
     * is why one function serves both (§3.1, §7.3, §7.5).
     * Also cancels the WorkManager reminder and notifies the counterparty.
     */
    suspend fun leaveOrRemove(sessionId: String, uid: String): ActionResult = TODO("§7.3")

    // ------------------------------------------------------------ host CRUD

    /**
     * One WriteBatch: the session document plus the host's `admin` member row.
     * The rules require `joinedCount == 1` and `memberUids == [hostUid]` at
     * creation, so this cannot be split into create-then-patch (§7.4).
     */
    suspend fun createSession(session: Session): Result<String> = TODO("§7.4")

    /** Edits to time/location fan out a `system` inbox item to every member (§7.5). */
    suspend fun editSession(session: Session): ActionResult = TODO("§7.5")

    /** Sets `status = cancelled` — never deletes, History still references it (§7.5). */
    suspend fun cancelSession(sessionId: String): ActionResult = TODO("§7.5")

    /** Appends a Storage download URL to `materialUrls` (§7.5). */
    suspend fun attachMaterial(sessionId: String, localFileUri: String): ActionResult =
        TODO("§7.5")

    /**
     * Continue-from-last: create the new session, then invite everyone from
     * the old one (§7.6). Skips blocked users and the host.
     */
    suspend fun inviteAllFrom(previousSessionId: String, newSessionId: String): ActionResult =
        TODO("§7.6")

    /** Convenience for the past/upcoming split, which is derived not stored (§3.1). */
    fun splitByTime(
        sessions: List<Session>,
        nowMillis: Long = System.currentTimeMillis(),
    ): Pair<List<Session>, List<Session>> = TODO("§7.6 — upcoming to first, past to second")

    fun isCancelled(session: Session): Boolean = session.status == SessionStatus.CANCELLED
}
