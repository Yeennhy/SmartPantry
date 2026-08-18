package com.studyfinder.app.data.repository

import com.studyfinder.app.util.ActionResult

/**
 * Firebase Auth, email/password provider (§7.0).
 *
 * Firebase persists the session across restarts, which is why [currentUid]
 * alone decides whether Splash routes to Login or onward.
 */
class AuthRepository {

    val currentUid: String? get() = TODO("§7.0")

    val currentEmail: String? get() = TODO("§7.0")

    /** Gates joining a *verified* community — see §7.1. */
    val isEmailVerified: Boolean get() = TODO("§7.0")

    suspend fun signIn(email: String, password: String): ActionResult = TODO("§7.0")

    /**
     * Creates the Auth account, writes `users/{uid}`, then sends the
     * verification email — in that order, because every downstream screen
     * reads the user document (§7.0).
     */
    suspend fun signUp(
        email: String,
        password: String,
        name: String,
        studentId: String,
    ): ActionResult = TODO("§7.0")

    suspend fun sendPasswordReset(email: String): ActionResult = TODO("§7.0")

    suspend fun resendVerificationEmail(): ActionResult = TODO("§7.0")

    /** Clears Auth, the Room cache and SharedPreferences flags (§7.0). */
    suspend fun signOut() {
        TODO("§7.0")
    }
}
