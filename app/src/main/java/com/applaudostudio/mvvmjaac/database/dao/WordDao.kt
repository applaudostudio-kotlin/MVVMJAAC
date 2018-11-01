package com.applaudostudio.mvvmjaac.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.applaudostudio.mvvmjaac.database.entity.Word


/**
 * Created by Jose Arteaga on 10/31/18.
 */
@Dao
interface WordDao {
    @Insert
    fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): List<Word>

}