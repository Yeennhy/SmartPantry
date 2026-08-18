package com.studyfinder.app.ui.sessionmanage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.studyfinder.app.databinding.ItemPendingRequestBinding
import com.studyfinder.app.model.SessionMember

/** Pending join requests, Approve / Reject per row (§7.5). */
class PendingRequestAdapter(
    private val onApprove: (SessionMember) -> Unit,
    private val onReject: (SessionMember) -> Unit,
) : ListAdapter<SessionMember, PendingRequestAdapter.ViewHolder>(DIFF) {

    class ViewHolder(val binding: ItemPendingRequestBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemPendingRequestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("§7.5")
    }

    private companion object {
        val DIFF = object : DiffUtil.ItemCallback<SessionMember>() {
            override fun areItemsTheSame(old: SessionMember, new: SessionMember) =
                old.uid == new.uid

            override fun areContentsTheSame(old: SessionMember, new: SessionMember) =
                old == new
        }
    }
}

/** The roster, with a Remove action per row (§7.5). The host cannot remove themselves. */
class ManageMemberAdapter(
    private val onRemove: (SessionMember) -> Unit,
    private val onClick: (SessionMember) -> Unit,
) : ListAdapter<SessionMember, ManageMemberAdapter.ViewHolder>(DIFF) {

    class ViewHolder(val binding: ItemPendingRequestBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemPendingRequestBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("§7.5")
    }

    private companion object {
        val DIFF = object : DiffUtil.ItemCallback<SessionMember>() {
            override fun areItemsTheSame(old: SessionMember, new: SessionMember) =
                old.uid == new.uid

            override fun areContentsTheSame(old: SessionMember, new: SessionMember) =
                old == new
        }
    }
}
