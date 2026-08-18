package com.studyfinder.app.ui.community

import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator

/** §7.1. */
class CommunityViewModel : ViewModel() {

    private val communityRepository = ServiceLocator.communityRepository

    /** The REST-backed browse list — the course's external-API requirement. */
    fun loadAllViaRest() {
        TODO("§7.1")
    }

    fun search(query: String) {
        TODO("§7.1")
    }

    fun filterByCity(city: String) {
        TODO("§7.1")
    }

    /**
     * Fails with a readable message when a verified community rejects the
     * email domain — an inline error, not a silent no-op (§7.1).
     */
    fun join(communityId: String) {
        TODO("§7.1")
    }
}
