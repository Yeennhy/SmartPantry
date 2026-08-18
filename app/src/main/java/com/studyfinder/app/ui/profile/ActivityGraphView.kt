package com.studyfinder.app.ui.profile

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View
import java.time.LocalDate

/**
 * GitHub-style contribution heatmap (§7.7): days on which the user joined a
 * session are lit up, darker for more sessions.
 *
 * A custom View rather than a charting library — it is a grid of coloured
 * rectangles, and pulling in a chart dependency for that would be the sort of
 * unnecessary new-concept cost §2 is trying to avoid.
 *
 * Structurally the same day grid as the calendar view in §7.6.
 */
class ActivityGraphView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : View(context, attrs, defStyleAttr) {

    /** Date -> number of sessions joined that day. */
    var data: Map<LocalDate, Int> = emptyMap()
        set(value) {
            field = value
            requestLayout()
            invalidate()
        }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        // TODO(§7.7): 7 rows (one per weekday) x N week columns; height is
        //  derived from the cell size, width from the number of weeks shown.
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // TODO(§7.7): draw one rounded rect per day, colour bucketed by count.
    }
}
