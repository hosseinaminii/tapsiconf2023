package com.example.tapsiconf.android

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tapsiconf.viewModel.GithubViewModel

@Composable
fun GithubScreen() {
    val githubViewModel: GithubViewModel = viewModel()

    Scaffold { paddingValues ->
        LazyColumn(modifier = Modifier.padding(paddingValues)) {
            items(githubViewModel.items.size) { index ->
                Item(githubViewModel, index)
            }
        }
    }
}

@Composable
private fun Item(
    githubViewModel: GithubViewModel,
    index: Int
) {
    Column(Modifier.padding(end = 16.dp, start = 16.dp, top = 10.dp)) {
        val repo = githubViewModel.items[index]
        Text(text = repo.name)
        Text(
            text = stringResource(
                id = R.string.repo_info,
                repo.forks,
                repo.watchers,
                repo.openIssues
            )
        )
    }
}

