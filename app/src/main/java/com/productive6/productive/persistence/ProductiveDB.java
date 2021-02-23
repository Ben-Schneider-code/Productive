package com.productive6.productive.persistence;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.productive6.productive.objects.Task;
import com.productive6.productive.objects.User;
import com.productive6.productive.persistence.daos.TaskDao;
import com.productive6.productive.persistence.daos.UserDao;

/**
 * Default database structure code required by Room
 * Implementation is auto-generated by the library.
 */
@Database(entities = {Task.class, User.class}, version = 1, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class ProductiveDB extends RoomDatabase {

    public abstract TaskDao getTaskDao();

    public abstract UserDao getUserDao();
}
