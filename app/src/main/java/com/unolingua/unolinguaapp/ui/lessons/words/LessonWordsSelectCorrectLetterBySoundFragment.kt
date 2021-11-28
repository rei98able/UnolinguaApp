package com.unolingua.unolinguaapp.ui.lessons.words

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unolingua.unolinguaapp.R

class LessonWordsSelectCorrectLetterBySoundFragment : Fragment() {

    companion object {
        fun newInstance() = LessonWordsSelectCorrectLetterBySoundFragment()
    }

    private lateinit var viewModel: LessonWordsSelectCorrectLetterBySoundViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.lesson_words_select_correct_letter_by_sound_fragment,
            container,
            false
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel =
            ViewModelProvider(this).get(LessonWordsSelectCorrectLetterBySoundViewModel::class.java)
        // TODO: Use the ViewModel
    }

}