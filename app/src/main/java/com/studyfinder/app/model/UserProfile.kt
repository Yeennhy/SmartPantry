package com.studyfinder.app.model

/**
 * `users/{uid}` (§3.1) — document ID is the Firebase Auth UID.
 *
 * Note there is no `blockedUserIds` field: any signed-in user can read any
 * profile, so the block list lives in the private `users/{uid}/blocked`
 * subcollection instead (§3.1, §7.7).
 */
data class UserProfile(
    val uid: String = "",
    val name: String = "",
    val studentId: String = "",
    val communityId: String = "",
    val department: String = "",
    val major: String = "",
    /** "khóa tuyển" in the spec. */
    val admissionYear: String = "",
    val bio: String = "",
    val photoUrl: String = "",
    val createdAtMillis: Long = 0L,
) {
    val hasCommunity: Boolean get() = communityId.isNotBlank()
}
