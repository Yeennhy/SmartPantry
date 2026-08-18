package com.studyfinder.app.ui.inbox

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.studyfinder.app.databinding.ItemInboxBinding
import com.studyfinder.app.model.InboxItem

/**
 * One row per inbox item (§7.8). The item's `type` decides the buttons:
 *  - `invite`       -> Accept + Details
 *  - `join_request` -> Details (opens Session Management)
 *  - `system`       -> mark read only
 */
class InboxAdapter(
    private val onAccept: (InboxItem) -> Unit,
    private val onDetails: (InboxItem) -> Unit,
) : ListAdapter<InboxItem, InboxAdapter.ViewHolder>(DIFF) {

    class ViewHolder(val binding: ItemInboxBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemInboxBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("§7.8")
    }

    private companion object {
        val DIFF = object : DiffUtil.ItemCallback<InboxItem>() {
            override fun areItemsTheSame(old: InboxItem, new: InboxItem) = old.id == new.id
            override fun areContentsTheSame(old: InboxItem, new: InboxItem) = old == new
        }
    }
}
