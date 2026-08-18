package com.studyfinder.app.data.remote.firestore

import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

/**
 * One place that knows the collection layout from §3.1, so a path typo is a
 * compile error somewhere else rather than a silent empty query.
 */
object FirestoreRefs {

    private val db: FirebaseFirestore get() = FirebaseFirestore.getInstance()

    // ---- top level ----
    fun communities(): CollectionReference = db.collection("communities")
    fun community(id: String): DocumentReference = communities().document(id)

    fun users(): CollectionReference = db.collection("users")
    fun user(uid: String): DocumentReference = users().document(uid)

    fun sessions(): CollectionReference = db.collection("sessions")
    fun session(id: String): DocumentReference = sessions().document(id)

    // ---- subcollections ----

    /** Membership rows. Always written together with the parent's counters (§3.1). */
    fun members(sessionId: String): CollectionReference =
        session(sessionId).collection("members")

    fun member(sessionId: String, uid: String): DocumentReference =
        members(sessionId).document(uid)

    /** Invites + notifications merged into one screen (§7.8). */
    fun inbox(uid: String): CollectionReference = user(uid).collection("inbox")

    /**
     * Private block list — a subcollection rather than a field, because the
     * parent user document is world-readable to signed-in users (§3.1, §7.7).
     */
    fun blocked(uid: String): CollectionReference = user(uid).collection("blocked")

    // ---- field names, so string literals live in exactly one file ----
    object Field {
        const val COMMUNITY_ID = "communityId"
        const val COURSE_ID = "courseId"
        const val COURSE_CATEGORY = "courseCategory"
        const val TAG_TYPE = "tagType"
        const val EXPECTATION_LEVEL = "expectationLevel"
        const val START_TIME = "startTime"
        const val END_TIME = "endTime"
        const val STATUS = "status"
        const val MEMBER_UIDS = "memberUids"
        const val JOINED_COUNT = "joinedCount"
        const val HOST_UID = "hostUid"
        const val STUDENT_ID = "studentId"
        const val CREATED_AT = "createdAt"
        const val UPDATED_AT = "updatedAt"
        const val CITY = "city"
    }
}
