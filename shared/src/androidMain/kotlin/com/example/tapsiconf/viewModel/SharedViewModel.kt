package com.example.tapsiconf.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope

actual open class SharedViewModel: ViewModel() {
    actual val sharedViewModelScope: CoroutineScope = this.viewModelScope

    protected actual open override fun onCleared() {
        super.onCleared()
    }
}