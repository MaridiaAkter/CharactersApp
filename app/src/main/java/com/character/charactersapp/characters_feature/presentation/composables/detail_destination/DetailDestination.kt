package com.character.charactersapp.characters_feature.presentation.composables.detail_destination

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.character.charactersapp.characters_feature.domain.model.Character
import com.character.charactersapp.characters_feature.presentation.composables.util.BackButtonHeader
import com.character.charactersapp.characters_feature.presentation.composables.util.CharacterDetail

@Composable
fun DetailDestination(
    modifier: Modifier = Modifier,
    character: Character,
    onBackButtonClick: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize()
    ) {
        BackButtonHeader(header = "Character Details") {
            onBackButtonClick()
        }
        CharacterDetail(character = character)
    }
}

