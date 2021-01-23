package com.workbenchstudio.gbkotlinhomework02.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.workbenchstudio.gbkotlinhomework02.models.Repository
import com.workbenchstudio.gbkotlinhomework02.ui.MainViewState

class MainViewModel: ViewModel() {

    private val viewStateModel: MutableLiveData<MainViewState> = MutableLiveData()

    init {
        viewStateModel.value = MainViewState(Repository.notes)
    }

    fun viewState(): LiveData<MainViewState> = viewStateModel
}