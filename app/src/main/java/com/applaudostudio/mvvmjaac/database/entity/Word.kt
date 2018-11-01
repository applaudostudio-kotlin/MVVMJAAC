package com.applaudostudio.mvvmjaac.database.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey





/**
 * Created by Jose Arteaga on 10/31/18.
 */


@Entity(tableName = "word_table")
class Word(@field:PrimaryKey
           @field:ColumnInfo(name = "word")
           val word: String)