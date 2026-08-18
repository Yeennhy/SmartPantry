package com.studyfinder.app.data.remote.rest

/**
 * Retrofit setup for the single REST call in §7.1.
 *
 * Note the `{PROJECT_ID}` placeholder in [PublicCommunityApi] must be replaced
 * with the real Firebase project ID once the project exists (§10 Phase 1) —
 * either by hardcoding the path or by adding a `@Path` parameter.
 */
object RetrofitClient {

    const val BASE_URL = "https://firestore.googleapis.com/"

    /** Built once, lazily; Moshi with the generated (KSP) adapters. */
    val publicCommunityApi: PublicCommunityApi by lazy {
        TODO("§7.1 — Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(MoshiConverterFactory.create(...))")
    }
}
