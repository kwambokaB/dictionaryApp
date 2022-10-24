package com.kwambokaB.dictionary.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kwambokaB.dictionary.feature_dictionary.domain.model.Meaning
import com.kwambokaB.dictionary.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String,
    @PrimaryKey val id:Int? = null
){
    fun toWordInfo(): WordInfo{
        return WordInfo(
            meanings = meanings,
            word = word,
            phonetic = phonetic
        )
    }
}
