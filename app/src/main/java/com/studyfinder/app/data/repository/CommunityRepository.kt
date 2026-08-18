package com.studyfinder.app.data.repository

import com.studyfinder.app.model.CampusLocation
import com.studyfinder.app.model.Community
import com.studyfinder.app.model.Course
import com.studyfinder.app.util.ActionResult
import com.studyfinder.app.util.UiState
import kotlinx.coroutines.flow.Flow

/**
 * Community selection (§7.1) — the one screen with two data sources.
 */
class CommunityRepository {

    /**
     * Initial "browse all" list, fetched over **Retrofit/REST**, not the SDK.
     * This is the course's external-API requirement; do not quietly swap it
     * for a Firestore query (§7.1).
     */
    fun observeAllViaRest(): Flow<UiState<List<Community>>> = TODO("§7.1")

    /** Search / filter as you type goes through the SDK, which is faster here. */
    fun searchByCity(city: String): Flow<UiState<List<Community>>> = TODO("§7.1")

    fun searchByName(query: String): Flow<UiState<List<Community>>> = TODO("§7.1")

    /**
     * Checks the email domain against the whitelist before writing
     * `communityId` onto the user doc; fails with a readable message when a
     * verified community rejects the domain (§7.1).
     */
    suspend fun joinCommunity(communityId: String): ActionResult = TODO("§7.1")

    /** Seeded per community; drives the Create Session dropdowns (§7.4). */
    suspend fun coursesFor(communityId: String): List<Course> = TODO("§3.1")

    /** Predefined campus locations, so sessions get lat/lng without geocoding. */
    suspend fun locationsFor(communityId: String): List<CampusLocation> = TODO("§3.1")
}
