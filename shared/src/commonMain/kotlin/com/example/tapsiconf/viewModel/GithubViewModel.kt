package com.example.tapsiconf.viewModel

import com.example.tapsiconf.response.ItemResponse
import com.example.tapsiconf.response.getMockResponses

class GithubViewModel: SharedViewModel() {
    val items: List<ItemResponse> = getMockResponses()
}