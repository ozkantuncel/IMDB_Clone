package com.example.imdbclone.ui.main_screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.imdbclone.R
import com.example.imdbclone.databinding.MainFragmentBinding
import com.example.imdbclone.ui.main_screen.adapter.MainFragmentBottomAdapter
import com.example.imdbclone.ui.main_screen.adapter.MainFragmentMedAdapter
import com.example.imdbclone.ui.main_screen.adapter.MainFragmentTopAdapter
import com.example.imdbclone.ui.main_screen.viewmodel.MainFragmentViewModel
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class MainFragment : Fragment() {
    private lateinit var binding: MainFragmentBinding
    private lateinit var viewModel: MainFragmentViewModel
    private val categories = listOf("Hepsi","Drama","Komedi","Gerlim","Daha Fazla.")
    private var selectedCategoryIndex = 0
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cratedChip()

        viewModel.moviesTopRec.observe(viewLifecycleOwner){
            val adapterTop = MainFragmentTopAdapter(requireContext(),it,viewModel)
            binding.mainTopAdapter = adapterTop

            val adapterMed = MainFragmentMedAdapter(requireContext(),it,viewModel)
            binding.mainMedAdapter = adapterMed

            val adapterBottom = MainFragmentBottomAdapter(requireContext(),it,viewModel)
            binding.mainBottomAdapter = adapterBottom
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:MainFragmentViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun cratedChip(){
        val chipGroup = listOf<ChipGroup>(binding.filterChipGroup,binding.filterChipGroup2)
        chipGroup.forEach{
            for(i in categories.indices){
                val chip = layoutInflater.inflate(R.layout.chip_main, null, false) as Chip
                chip.text = categories[i]
                chip.isClickable = true
                chip.isChecked = i == selectedCategoryIndex
                //binding.filterChipGroup.addView(chip)
                it.addView(chip)
            }
        }

    }
}