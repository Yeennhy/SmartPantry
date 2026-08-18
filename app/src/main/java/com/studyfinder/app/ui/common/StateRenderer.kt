package com.studyfinder.app.ui.common

import android.view.View
import com.studyfinder.app.util.UiState

/**
 * The four-state rendering contract every data-backed screen owes (§2.1).
 *
 * Centralised so "loading / empty / error / offline" is one call per screen
 * instead of four hand-rolled visibility blocks that drift apart — §2.1 is
 * explicit that this is a per-screen checklist item, not a final polish pass.
 */
object StateRenderer {

    /**
     * @param stateContainer the `view_ui_states.xml` include on the screen
     * @param content the real content view, shown only on Success/Offline
     * @param onRetry invoked by the error state's retry button
     */
    fun <T> render(
        state: UiState<T>,
        stateContainer: View,
        content: View,
        onRetry: () -> Unit,
        onSuccess: (T) -> Unit,
    ) {
        TODO("§2.1 — loading / empty / error / offline + 'showing cached data' hint")
    }
}
