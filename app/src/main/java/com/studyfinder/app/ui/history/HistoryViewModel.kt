package com.studyfinder.app.ui.history

import androidx.lifecycle.ViewModel
import com.studyfinder.app.ServiceLocator

/** §7.6. Same query as My Sessions, filtered to `endTime` in the past. */
class HistoryViewModel : ViewModel() {

    private val sessionRepository = ServiceLocator.sessionRepository

    fun observePast() {
        TODO("§7.6")
    }

    /**
     * 🟢 NOT in the team's original spec — added by the plan, and the first
     * thing to cut (§7.6). CSV is a plain delimited string; PDF uses Android's
     * built-in PdfDocument. Shared via FileProvider + ACTION_SEND.
     */
    fun exportCsv() {
        TODO("§7.6")
    }

    fun exportPdf() {
        TODO("§7.6")
    }
}
