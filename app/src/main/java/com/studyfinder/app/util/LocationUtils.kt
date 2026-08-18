package com.studyfinder.app.util

/**
 * Haversine distance for Home's proximity sort (§7.2).
 *
 * Client-side maths on lat/lng that already came back with the session query —
 * no geocoding, no extra request, no continuous location subscription.
 */
object LocationUtils {

    /** Great-circle distance in kilometres. */
    fun distanceKm(
        fromLat: Double,
        fromLng: Double,
        toLat: Double,
        toLng: Double,
    ): Double = TODO("Haversine formula — §7.2")

    /** "0.3 km away" / "1.2 km away", the delivery-app style label in the spec. */
    fun formatDistance(km: Double): String = TODO("§7.2")
}
