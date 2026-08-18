package com.studyfinder.app.util

import android.content.Context
import android.net.Uri
import com.studyfinder.app.model.Session
import java.io.File

/**
 * CSV / PDF export of the history list (§7.6).
 *
 * NOTE: this feature is not in the team's original spec — it was added by the
 * plan and is marked 🟢 "cut first" in §10. Everything here is stdlib plus
 * Android's built-in `PdfDocument`; no export library is involved.
 *
 * Sharing goes through FileProvider + ACTION_SEND, which is why
 * `res/xml/file_paths.xml` and the manifest provider entry exist.
 */
object HistoryExporter {

    fun buildCsv(sessions: List<Session>): String = TODO("§7.6 — plain delimited string")

    /** Uses android.graphics.pdf.PdfDocument for simple text/table drawing. */
    fun writePdf(context: Context, sessions: List<Session>): File = TODO("§7.6")

    fun writeCsv(context: Context, sessions: List<Session>): File = TODO("§7.6")

    /** Wraps the file in a FileProvider content:// Uri ready for ACTION_SEND. */
    fun shareableUri(context: Context, file: File): Uri = TODO("§7.6")
}
