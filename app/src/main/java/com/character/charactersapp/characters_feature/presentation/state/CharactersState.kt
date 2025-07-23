package com.character.charactersapp.characters_feature.presentation.state

import com.character.charactersapp.characters_feature.domain.model.Character

data class CharactersState(
    val characterData: List<Character> = emptyList(),
    val isLoading: Boolean = false,
    val errorMsg: String? = ""
)
