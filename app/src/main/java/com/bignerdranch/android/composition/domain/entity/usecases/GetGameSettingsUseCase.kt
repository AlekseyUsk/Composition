package com.bignerdranch.android.composition.domain.entity.usecases

import com.bignerdranch.android.composition.domain.entity.GameSettings
import com.bignerdranch.android.composition.domain.entity.Level
import com.bignerdranch.android.composition.domain.entity.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }

}