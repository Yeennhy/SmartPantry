package com.studyfinder.app.ui.home

import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator
import com.studyfinder.app.model.CourseCategory
import com.studyfinder.app.model.SessionSort
import com.studyfinder.app.model.TagType

/**
 * §7.2. Holds the full filter/sort state so a rotation does not reset it.
 */
class HomeViewModel : ViewModel() {

    private val sessionRepository = ServiceLocator.sessionRepository
    private val profileRepository = ServiceLocator.profileRepository

    data class Filters(
        val courseIdQuery: String? = null,
        val tagType: TagType? = null,
        val courseCategory: CourseCategory? = null,
        val sort: SessionSort = SessionSort.TIME,
        /** Grey out rather than hide, so the list never silently shrinks (§7.2). */
        val hideOverlapping: Boolean = false,
    )

    fun setSort(sort: SessionSort) {
        TODO("§7.2")
    }

    fun setCourseIdQuery(query: String?) {
        TODO("§7.2")
    }

    /** Spec: session type chips — normal / midterm / final. */
    fun setTagType(tagType: TagType?) {
        TODO("§7.2")
    }

    /** Spec: course type chips — physics / calculus / DSA / … */
    fun setCourseCategory(category: CourseCategory?) {
        TODO("§7.2")
    }

    /**
     * One-time `getCurrentLocation()` fetch, then client-side Haversine sort.
     * Not a continuous subscription (§7.2).
     */
    fun sortByDistance() {
        TODO("§7.2")
    }

    /** Called when the location permission is refused — silent fallback, no error UI. */
    fun onLocationPermissionDenied() {
        TODO("§7.2")
    }
}
