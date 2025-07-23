package com.character.charactersapp.characters_feature.di.qualifier

import javax.inject.Qualifier


@Retention(AnnotationRetention.RUNTIME)
@Qualifier
annotation class IODispatcher()

@Retention(AnnotationRetention.RUNTIME)
@Qualifier
annotation class MainDispatcher()
