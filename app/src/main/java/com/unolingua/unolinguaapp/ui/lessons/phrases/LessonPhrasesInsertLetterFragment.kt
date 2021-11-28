package com.unolingua.unolinguaapp.ui.lessons.phrases

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unolingua.unolinguaapp.R

class LessonPhrasesInsertLetterFragment : Fragment() {

    companion object {
        fun newInstance() = LessonPhrasesInsertLetterFragment()
    }

    private lateinit var viewModel: LessonPhrasesInsertLetterViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lesson_phrases_insert_letter_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LessonPhrasesInsertLetterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}