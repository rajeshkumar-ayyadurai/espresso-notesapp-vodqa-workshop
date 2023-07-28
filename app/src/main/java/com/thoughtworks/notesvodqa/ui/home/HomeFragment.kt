package com.thoughtworks.notesvodqa.ui.home

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.thoughtworks.notesvodqa.databinding.DialogAddNotesBinding
import com.thoughtworks.notesvodqa.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private var homeViewModel: HomeViewModel? = null
    private val notesAdapter: NotesAdapter by lazy {
        NotesAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindRecyclerView()
        homeViewModel?.notes?.observe(
            viewLifecycleOwner,
        ) { notes ->
            notesAdapter.setAdapterItems(notes)
        }
        binding.addNewNotes.setOnClickListener {
            showDialog {
                notesAdapter.addAdapterItem(it)
            }
        }
    }

    private fun showDialog(notes: (String) -> Unit) {
        val binding = DialogAddNotesBinding.inflate(LayoutInflater.from(this.requireContext()))
        val alertDialogBuilder = AlertDialog.Builder(this.requireContext())
        alertDialogBuilder.setView(binding.root)
        val alertDialog = alertDialogBuilder.setCancelable(true).create()
        binding.cancelDialog.setOnClickListener {
            alertDialog.hide()
        }
        binding.addNotesDialog.setOnClickListener {
            if (binding.addNotesDialogEditText.text.toString().isNotEmpty()) {
                notes(binding.addNotesDialogEditText.text.toString())
            }
            alertDialog.hide()
        }
        alertDialog.show()
    }

    private fun bindRecyclerView() {
        binding.notesListView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = notesAdapter
        }
    }
}
