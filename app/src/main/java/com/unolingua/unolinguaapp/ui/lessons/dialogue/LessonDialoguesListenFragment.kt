package com.unolingua.unolinguaapp.ui.lessons.dialogue

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unolingua.unolinguaapp.R

class LessonDialoguesListenFragment : Fragment() {

    companion object {
        fun newInstance() = LessonDialoguesListenFragment()
    }

    private lateinit var viewModel: LessonDialoguesListenViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.lesson_dialogues_listen_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(LessonDialoguesListenViewModel::class.java)
        // TODO: Use the ViewModel
    }

}