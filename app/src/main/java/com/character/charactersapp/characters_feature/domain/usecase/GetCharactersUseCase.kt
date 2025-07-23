package com.character.charactersapp.characters_feature.domain.usecase

import com.character.charactersapp.characters_feature.domain.repository.CharactersRepository
import javax.inject.Inject

class GetCharactersUseCase @Inject constructor(private val charactersRepository: CharactersRepository) {
    operator fun invoke() = charactersRepository.getAllCharactersStream()
}