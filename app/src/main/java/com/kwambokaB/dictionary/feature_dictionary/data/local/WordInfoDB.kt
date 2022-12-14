package com.kwambokaB.dictionary.feature_dictionary.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kwambokaB.dictionary.feature_dictionary.data.local.entity.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 2
)

@TypeConverters(Converters::class)
abstract class WordInfoDB:RoomDatabase() {
    abstract val dao:WordInfoDao
}