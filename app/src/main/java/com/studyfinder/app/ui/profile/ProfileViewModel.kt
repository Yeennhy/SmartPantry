package com.studyfinder.app.ui.profile

import android.net.Uri
import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator
import com.studyfinder.app.model.UserProfile

/** §7.7. */
class ProfileViewModel : ViewModel() {

    private val profileRepository = ServiceLocator.profileRepository
    private val authRepository = ServiceLocator.authRepository

    /** null uid = self view. */
    fun start(uid: String?) {
        TODO("§7.7")
    }

    fun save(profile: UserProfile) {
        TODO("§7.7")
    }

    /** Same Storage path for both the camera Intent and the Photo Picker. */
    fun uploadPhoto(uri: Uri) {
        TODO("§7.7")
    }

    /**
     * Activity graph (§7.7). Reuses the My Sessions query result — NOT a
     * `collectionGroup("members")` query, which §4 does not permit.
     */
    fun observeActivityByDate() {
        TODO("§7.7")
    }

    /**
     * Writes `users/{myUid}/blocked/{theirUid}` — a private subcollection, so
     * the blocked person cannot read the list (§3.1). The visible effect is on
     * Home: sessions whose member list contains them are greyed out (§7.2).
     */
    fun blockUser(uid: String) {
        TODO("§7.7")
    }

    fun unblockUser(uid: String) {
        TODO("§7.7")
    }

    fun resendVerificationEmail() {
        TODO("§7.0")
    }

    fun signOut() {
        TODO("§7.0")
    }
}
