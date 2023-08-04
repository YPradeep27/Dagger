package com.app.myapplication3.utilities.roomDatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertUser(user: UserEntity)

    @Query("SELECT * FROM UserTable")
    fun getAllUsers() : LiveData<List<UserEntity>>

    @Query("SELECT * FROM UserTable WHERE id=:Id")
    fun getUsersDetailsById(Id: Int) : LiveData<UserEntity>
}