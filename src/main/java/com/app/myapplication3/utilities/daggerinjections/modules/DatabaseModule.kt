package com.app.myapplication3.utilities.daggerinjections.modules

import android.app.Application
import android.content.Context
import com.app.myapplication3.utilities.daggerinjections.annotations.qualifiers.ApplicationContext
import com.app.myapplication3.utilities.roomDatabase.UserDao
import com.app.myapplication3.utilities.roomDatabase.UserDatabase
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun provideDatabase(context: Context) : UserDatabase {
        return UserDatabase.getDatabase(context)
    }

    @Provides
    fun provideDao(database: UserDatabase) : UserDao{
        return database.roomDao()
    }

}