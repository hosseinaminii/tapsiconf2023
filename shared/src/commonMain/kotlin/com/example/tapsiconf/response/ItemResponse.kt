package com.example.tapsiconf.response

data class ItemResponse(
    val id: Int,
    val name: String,
    val forks: Int,
    val openIssues: Int,
    val watchers: Int
)

fun getMockResponses() = listOf(
    ItemResponse(
        id = 1,
        name = "repo 1",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    ),
    ItemResponse(
        id = 2,
        name = "repo 2",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    ),
    ItemResponse(
        id = 3,
        name = "repo 3",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    ),
    ItemResponse(
        id = 4,
        name = "repo 4",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    ),
    ItemResponse(
        id = 5,
        name = "repo 5",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    ),
    ItemResponse(
        id = 6,
        name = "repo 6",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    ),
    ItemResponse(
        id = 7,
        name = "repo 7",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    ),
    ItemResponse(
        id = 8,
        name = "repo 8",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    ),
    ItemResponse(
        id = 9,
        name = "repo 10",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    ),
    ItemResponse(
        id = 10,
        name = "repo 10",
        forks = (0..1000).random(),
        openIssues = (0..1000).random(),
        watchers = (0..1000).random()
    )
)
