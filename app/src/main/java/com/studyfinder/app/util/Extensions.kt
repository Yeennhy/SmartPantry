package com.studyfinder.app.util

import android.view.View

/** Small view helpers shared across fragments. Keep this file boring. */

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.visibleIf(condition: Boolean) {
    visibility = if (condition) View.VISIBLE else View.GONE
}
