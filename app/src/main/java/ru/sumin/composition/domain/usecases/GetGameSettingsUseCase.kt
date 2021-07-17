package ru.sumin.composition.domain.usecases

import ru.sumin.composition.domain.entity.GameSettings
import ru.sumin.composition.domain.entity.Level
import ru.sumin.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
