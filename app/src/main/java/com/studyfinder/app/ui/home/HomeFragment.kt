package com.studyfinder.app.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.studyfinder.app.databinding.FragmentHomeBinding

/**
 * Placeholder for the Home / Upcoming sessions screen (§7.2 of the dev plan).
 *
 * Exists so the navigation graph has a real start destination and the project
 * builds and runs; the session list, sorting and filtering land in Phase 3.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
