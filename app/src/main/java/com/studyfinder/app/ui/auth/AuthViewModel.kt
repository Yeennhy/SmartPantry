package com.studyfinder.app.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator
import com.studyfinder.app.util.ActionResult

/**
 * Shared by Splash, Login, Signup and Forgot Password (§7.0).
 */
class AuthViewModel : ViewModel() {

    private val authRepository = ServiceLocator.authRepository

    private val _result = MutableLiveData<ActionResult>()
    val result: LiveData<ActionResult> = _result

    /** Which of the three Splash routes applies (§7.0). */
    enum class StartRoute { LOGIN, COMMUNITY_SELECTION, HOME }

    fun resolveStartRoute(onResolved: (StartRoute) -> Unit) {
        TODO("§7.0")
    }

    fun signIn(email: String, password: String) {
        TODO("§7.0")
    }

    fun signUp(email: String, password: String, name: String, studentId: String) {
        TODO("§7.0")
    }

    fun sendPasswordReset(email: String) {
        TODO("§7.0")
    }

    /** Clears Auth, the Room cache and prefs, then Login pops the whole stack. */
    fun signOut() {
        TODO("§7.0")
    }
}
