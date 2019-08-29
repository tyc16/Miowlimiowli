package io.miowlimiowli.manager.sql;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import io.miowlimiowli.manager.Comment;

//TODO:exportSchema = false for test
@Database(entities = {SqlNews.class, SqlUserandNews.class, Comment.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SqlNewsDao SqlNewsDao();
    public abstract  SqlUserandNewsDao SqlUserandNewsDao();
}