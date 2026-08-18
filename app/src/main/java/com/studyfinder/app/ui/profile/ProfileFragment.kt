package com.studyfinder.app.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.studyfinder.app.databinding.FragmentProfileBinding

/**
 * Profile (§7.7) — two viewing modes in one destination.
 *
 * `uid == null` is **self view**: editable, with photo upload and sign-out.
 * A non-null `uid` is the **read-only view** reached from a member list,
 * where the only action is Block.
 *
 * Fields per the spec: community, department, major, khóa tuyển
 * (`admissionYear`), name, student ID, bio.
 */
class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private val args: ProfileFragmentArgs by navArgs()
    private val viewModel: ProfileViewModel by viewModels()

    private val isSelfView: Boolean get() = args.uid == null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO(§7.7): render fields; in self view show edit + photo bottom
        //  sheet ("Take photo" / "Choose from gallery" — two different
        //  launchers behind one button) and the activity graph; in read-only
        //  view show Block instead. Hide every edit control when !isSelfView.
    }

    /** The spec's "community edit in profile" entry point (§7.1). */
    private fun changeCommunity() {
        findNavController().navigate(
            ProfileFragmentDirections.actionProfileFragmentToCommunitySelectionFragment(
                isEditMode = true
            )
        )
    }

    /** Sign-out clears the Room cache, then pops the whole stack (§7.0). */
    private fun signOut() {
        findNavController().navigate(
            ProfileFragmentDirections.actionProfileFragmentToLoginFragment()
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
