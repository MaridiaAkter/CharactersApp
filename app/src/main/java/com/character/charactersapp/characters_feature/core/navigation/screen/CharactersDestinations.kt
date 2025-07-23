package com.character.charactersapp.characters_feature.core.navigation.screen

import com.character.charactersapp.characters_feature.core.utils.Constants.DETAIL_DESTINATION
import com.character.charactersapp.characters_feature.core.utils.Constants.HOME_DESTINATION

sealed class CharactersDestinations(val route: String) {
    data object HomeDestination :
        CharactersDestinations(HOME_DESTINATION)

    data object DetailDestination :
        CharactersDestinations(DETAIL_DESTINATION)
}