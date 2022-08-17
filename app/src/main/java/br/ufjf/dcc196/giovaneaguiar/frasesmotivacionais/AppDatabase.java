package br.ufjf.dcc196.giovaneaguiar.frasesmotivacionais;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {FrasesMotivacionais.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public static final String DB_NAME = "frasesmotivacionais-db";
    private static AppDatabase INSTANCE;

    public abstract FrasesMotivacionaisDAO frasesMotivacionaisDAO();

    public static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(
                    context.getApplicationContext(),
                    AppDatabase.class,
                    DB_NAME
            ).build();

        }
        return INSTANCE;
    }

}
