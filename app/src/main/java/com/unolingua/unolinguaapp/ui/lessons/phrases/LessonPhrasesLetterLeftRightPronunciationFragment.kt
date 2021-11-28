package com.unolingua.unolinguaapp.ui.lessons.phrases

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unolingua.unolinguaapp.R

class LessonPhrasesLetterLeftRightPronunciationFragment : Fragment() {

    companion object {
        fun newInstance() = LessonPhrasesLetterLeftRightPronunciationFragment()
    }

    private lateinit var viewModel: LessonPhrasesLetterLeftRightPronunciationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.lesson_phrases_letter_left_right_pronunciation_fragment,
            container,
            false
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel =
            ViewModelProvider(this).get(LessonPhrasesLetterLeftRightPronunciationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}