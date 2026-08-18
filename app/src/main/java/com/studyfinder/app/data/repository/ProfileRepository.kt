package com.studyfinder.app.data.repository

import android.net.Uri
import com.studyfinder.app.model.UserProfile
import com.studyfinder.app.util.ActionResult
import com.studyfinder.app.util.UiState
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

/**
 * Profile, photo upload, block list and the activity graph (§7.7).
 */
class ProfileRepository {

    fun observeCurrentProfile(): Flow<UiState<UserProfile>> = TODO("§7.7")

    /** Read-only view, reached by tapping a member avatar (§7.3). */
    fun observeProfile(uid: String): Flow<UiState<UserProfile>> = TODO("§7.7")

    suspend fun updateProfile(profile: UserProfile): ActionResult = TODO("§7.7")

    /**
     * Same Storage upload path for both sources the spec names — the system
     * camera Intent and the Photo Picker. Writes `photoUrl` on success (§7.7).
     */
    suspend fun uploadProfilePhoto(localUri: Uri): ActionResult = TODO("§7.7")

    /** Invite-by-student-ID search (§7.5). Needs a single-field index. */
    suspend fun findByStudentId(studentId: String): List<UserProfile> = TODO("§7.5")

    /**
     * Activity graph (§7.7). Deliberately reuses the My Sessions query result
     * rather than issuing a `collectionGroup("members")` query, which the
     * security rules in §4 do not grant access to.
     */
    fun observeActivityByDate(): Flow<Map<LocalDate, Int>> = TODO("§7.7")

    // ------------------------------------------------------------ block list

    /**
     * Loaded once at app start into an in-memory set, since it is read on
     * every list render (§7.7).
     */
    fun observeBlockedUids(): Flow<Set<String>> = TODO("§7.7")

    suspend fun blockUser(uid: String): ActionResult = TODO("§7.7")

    suspend fun unblockUser(uid: String): ActionResult = TODO("§7.7")
}
