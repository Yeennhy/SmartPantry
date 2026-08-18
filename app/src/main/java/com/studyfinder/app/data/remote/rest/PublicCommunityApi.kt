package com.studyfinder.app.data.remote.rest

import com.studyfinder.app.data.remote.rest.dto.CommunityListResponse
import com.studyfinder.app.model.Community
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * The one deliberate REST call in the whole app (§7.1) — this is what
 * satisfies the course's external-API requirement.
 *
 * It hits Firestore's public REST endpoint for the `communities` collection,
 * which is unauthenticated read-only data (§4). Everything else in the app
 * goes through the Firebase SDK instead.
 */
interface PublicCommunityApi {

    @GET("v1/projects/{PROJECT_ID}/databases/(default)/documents/communities")
    suspend fun listCommunities(
        @Query("pageSize") pageSize: Int = 100,
        @Query("pageToken") pageToken: String? = null,
    ): CommunityListResponse
}

/**
 * Maps the wire format down to the plain [Community] model at the repository
 * boundary, so no other layer ever sees a `stringValue` wrapper (§7.1).
 */
object CommunityRestMapper {
    fun toCommunities(response: CommunityListResponse): List<Community> = TODO("§7.1")
}
