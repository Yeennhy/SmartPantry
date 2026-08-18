package com.studyfinder.app.data.remote.firestore

import com.google.firebase.firestore.DocumentSnapshot
import com.studyfinder.app.data.local.entity.MySessionEntity
import com.studyfinder.app.data.local.entity.ProfileEntity
import com.studyfinder.app.data.local.entity.SessionEntity
import com.studyfinder.app.model.Community
import com.studyfinder.app.model.InboxItem
import com.studyfinder.app.model.Session
import com.studyfinder.app.model.SessionMember
import com.studyfinder.app.model.UserProfile

/**
 * Firestore document ⇄ model ⇄ Room entity conversion (§3.2).
 *
 * There is no separate domain layer — these are the only mapping functions in
 * the app, and they all live here.
 */
object FirestoreMappers {

    // ---- Firestore -> model ----
    fun toSession(doc: DocumentSnapshot): Session? = TODO("§3.1")

    fun toCommunity(doc: DocumentSnapshot): Community? = TODO("§3.1")

    fun toUserProfile(doc: DocumentSnapshot): UserProfile? = TODO("§3.1")

    fun toSessionMember(doc: DocumentSnapshot): SessionMember? = TODO("§3.1")

    fun toInboxItem(doc: DocumentSnapshot): InboxItem? = TODO("§3.1")

    // ---- model -> Firestore ----

    /**
     * The create payload must already carry hostUid, joinedCount = 1 and
     * memberUids = [hostUid], or the security rules reject it (§4, §7.4).
     */
    fun sessionCreatePayload(session: Session, hostUid: String): Map<String, Any?> =
        TODO("§7.4")

    fun sessionEditPayload(session: Session): Map<String, Any?> = TODO("§7.5")

    fun profilePayload(profile: UserProfile): Map<String, Any?> = TODO("§7.7")

    /**
     * Cross-user inbox writes are constrained by the rules: fromUid must be
     * the caller, read must be false, message under 500 chars (§4).
     */
    fun inboxPayload(item: InboxItem, fromUid: String): Map<String, Any?> = TODO("§7.5")

    // ---- model -> Room ----
    fun toEntity(session: Session, cachedAtMillis: Long): SessionEntity = TODO("§3.2")

    fun toMySessionEntity(session: Session, cachedAtMillis: Long): MySessionEntity =
        TODO("§3.2")

    fun toEntity(profile: UserProfile): ProfileEntity = TODO("§3.2")

    // ---- Room -> model ----
    fun toModel(entity: SessionEntity): Session = TODO("§3.2")

    fun toModel(entity: ProfileEntity): UserProfile = TODO("§3.2")
}
