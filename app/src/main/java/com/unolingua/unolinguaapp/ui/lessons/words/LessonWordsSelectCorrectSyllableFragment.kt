package com.unolingua.unolinguaapp.ui.lessons.words

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unolingua.unolinguaapp.R

class LessonWordsSelectCorrectSyllableFragment : Fragment() {

    companion object {
        fun newInstance() = LessonWordsSelectCorrectSyllableFragment()
    }

    private lateinit var viewModel: LessonWordsSelectCorrectSyllableViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.lesson_words_select_correct_syllable_fragment,
            container,
            false
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel =
            ViewModelProvider(this).get(LessonWordsSelectCorrectSyllableViewModel::class.java)
        // TODO: Use the ViewModel
    }

}