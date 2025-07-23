package com.character.charactersapp.characters_feature.presentation.event

import com.character.charactersapp.characters_feature.domain.model.Character

sealed class UiEvent {
    class SearchCharactersQuery(val query: String) : UiEvent()
    data class NavigateToDetailScreen(val character: Character) : UiEvent()
}