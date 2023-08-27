package com.example.tapsiconf.viewModel

import com.example.tapsiconf.GithubRepository
import com.example.tapsiconf.response.ItemResponse
import com.example.tapsiconf.response.getMockResponses
import com.rickclephas.kmp.nativecoroutines.NativeCoroutinesState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class GithubViewModel(private val githubRepository: GithubRepository): SharedViewModel() {

    private val _items = MutableStateFlow<List<ItemResponse>>(listOf())
    val items = _items.asStateFlow()

    init {
        sharedViewModelScope.launch {
            _items.update { githubRepository.getRepos() }
        }
    }

}