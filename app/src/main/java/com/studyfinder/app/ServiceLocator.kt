package com.studyfinder.app

import android.content.Context
import com.studyfinder.app.data.local.AppDatabase
import com.studyfinder.app.data.repository.AuthRepository
import com.studyfinder.app.data.repository.CommunityRepository
import com.studyfinder.app.data.repository.InboxRepository
import com.studyfinder.app.data.repository.ProfileRepository
import com.studyfinder.app.data.repository.SessionRepository

/**
 * Manual dependency injection (§2).
 *
 * Deliberately not Hilt or Koin — at this size a single object that builds
 * each repository once is enough, and it avoids introducing DI as a whole new
 * concept to a team already absorbing Firebase.
 */
object ServiceLocator {

    private lateinit var appContext: Context

    fun init(context: Context) {
        appContext = context.applicationContext
    }

    val database: AppDatabase by lazy { AppDatabase.getInstance(appContext) }

    val authRepository: AuthRepository by lazy { AuthRepository() }
    val communityRepository: CommunityRepository by lazy { CommunityRepository() }
    val sessionRepository: SessionRepository by lazy { SessionRepository() }
    val profileRepository: ProfileRepository by lazy { ProfileRepository() }
    val inboxRepository: InboxRepository by lazy { InboxRepository() }
}
