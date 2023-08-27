package com.example.tapsiconf.di

import com.example.tapsiconf.viewModel.SharedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.definition.Definition
import org.koin.core.definition.KoinDefinition
import org.koin.core.module.Module
import org.koin.core.qualifier.Qualifier

actual inline fun <reified T : SharedViewModel> Module.sharedViewModel(
    qualifier: Qualifier?,
    noinline definition: Definition<T>
): KoinDefinition<T> {
    return viewModel(qualifier, definition)
}