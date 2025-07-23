package com.character.charactersapp.characters_feature.presentation.state

import com.character.charactersapp.characters_feature.domain.model.Character

data class CharacterDetailState(
    val character: Character = Character(),
    val isLoading: Boolean = false,
    val errorMsg: String? = ""
)