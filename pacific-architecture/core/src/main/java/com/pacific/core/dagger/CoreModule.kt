package com.pacific.core.dagger

import android.app.Application
import androidx.room.Room
import com.pacific.core.SQL_DB3
import com.pacific.core.storage.db.RoomAppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [CoreBinder::class])
class CoreModule {

    @Provides
    @Singleton
    fun provideAppDatabase(app: Application): RoomAppDatabase {
        return Room.databaseBuilder(app, RoomAppDatabase::class.java, SQL_DB3).build()
    }
}