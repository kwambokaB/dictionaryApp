package com.kwambokaB.dictionary.feature_dictionary.data.remote.dto

import com.kwambokaB.dictionary.feature_dictionary.data.local.entity.WordInfoEntity
import com.kwambokaB.dictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val origin: String,
    val word: String
){
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings.map { it.toMeaning() },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }
}