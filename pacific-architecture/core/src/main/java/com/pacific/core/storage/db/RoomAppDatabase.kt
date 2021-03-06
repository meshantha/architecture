package com.pacific.core.storage.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pacific.data.db.AppDatabase
import com.pacific.data.db.entities.DbUser

@Database(
    entities = [
        DbUser::class
    ],
    version = 1,
    exportSchema = true
)
abstract class RoomAppDatabase : RoomDatabase(), AppDatabase