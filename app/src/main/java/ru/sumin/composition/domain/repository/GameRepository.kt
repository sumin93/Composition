package ru.sumin.composition.domain.repository

import ru.sumin.composition.domain.entity.GameSettings
import ru.sumin.composition.domain.entity.Level
import ru.sumin.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
