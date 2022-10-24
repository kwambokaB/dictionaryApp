package com.kwambokaB.dictionary.feature_dictionary.domain.model

import com.kwambokaB.dictionary.feature_dictionary.data.remote.dto.MeaningDto
import com.kwambokaB.dictionary.feature_dictionary.data.remote.dto.PhoneticDto

data class WordInfo (
    val meanings: List<Meaning>,
    val phonetic: String,
    val origin: String,
    val word: String
)