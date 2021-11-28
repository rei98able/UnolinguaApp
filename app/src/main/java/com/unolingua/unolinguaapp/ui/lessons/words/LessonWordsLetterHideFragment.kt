package com.unolingua.unolinguaapp.ui.lessons.words

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unolingua.unolinguaapp.R

class LessonWordsLetterHideFragment : Fragment() {

    companion object {
        fun newInstance() = LessonWordsLetterHideFragment()
    }

    private lateinit var viewModel: LessonWordsLetterHideViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lesson_words_letter_hide_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LessonWordsLetterHideViewModel::class.java)
        // TODO: Use the ViewModel
    }

}