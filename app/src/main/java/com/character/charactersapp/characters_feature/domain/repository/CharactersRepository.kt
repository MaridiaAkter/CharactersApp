package com.character.charactersapp.characters_feature.domain.repository

import com.character.charactersapp.characters_feature.core.common.Resource
import com.character.charactersapp.characters_feature.domain.model.Character
import kotlinx.coroutines.flow.Flow

interface CharactersRepository {
    fun getAllCharactersStream(): Flow<Resource<List<Character>>>
    fun searchCharactersStream(query: String): Flow<Resource<List<Character>>>
}