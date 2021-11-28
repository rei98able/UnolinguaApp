package com.unolingua.unolinguaapp.ui.lessons.words

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unolingua.unolinguaapp.R

class LessonWordsFullWordByLettersFragment : Fragment() {

    companion object {
        fun newInstance() = LessonWordsFullWordByLettersFragment()
    }

    private lateinit var viewModel: LessonWordsFullWordByLettersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.lesson_words_full_word_by_letters_fragment,
            container,
            false
        )
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LessonWordsFullWordByLettersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}