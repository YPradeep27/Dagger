package com.app.myapplication3.utilities.roomDatabase

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "UserTable")
data class UserEntity (

    @PrimaryKey
    @NonNull
    var id: Int,

    @NonNull
    @ColumnInfo(name = "Image")
    var avatar: String,

    @NonNull
    @ColumnInfo(name = "Email")
    var email: String,

    @NonNull
    @ColumnInfo(name = "FirstName")
    var first_name: String,

    @NonNull
    @ColumnInfo(name = "LastName")
    var last_name: String

    )