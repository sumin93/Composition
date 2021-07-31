package ru.sumin.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameSettings(
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
) : Parcelable {

    val minCountOfRightAnswersString: String
        get() = minCountOfRightAnswers.toString()

    val minPercentOfRightAnswersString: String
        get() = minPercentOfRightAnswers.toString()
}
