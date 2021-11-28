package com.unolingua.unolinguaapp.ui.lessons.words

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unolingua.unolinguaapp.R

class LessonWordsPhotoSoundFragment : Fragment() {

    companion object {
        fun newInstance() = LessonWordsPhotoSoundFragment()
    }

    private lateinit var viewModel: LessonWordsPhotoSoundViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lesson_words_photo_sound_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LessonWordsPhotoSoundViewModel::class.java)
        // TODO: Use the ViewModel
    }

}