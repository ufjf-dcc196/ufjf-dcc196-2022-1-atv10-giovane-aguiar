package br.ufjf.dcc196.giovaneaguiar.frasesmotivacionais;

import android.content.Context;
import android.content.SharedPreferences;

public class FrasesRepository {
    private Context context;
    private SharedPreferences preferences;
    private final String PREFERENCES_NAME = "br.ufjf.dcc196.giovaneaguiar.frasesmotivacionais";
    private final String FRASES_KEY = "FRASES_KEY";

    public FrasesRepository(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public String[] getFrases() {
        return new String[]{preferences.getString(FRASES_KEY, "default")};

    }

    public void setFrases(String frase) {
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(FRASES_KEY, frase);
        editor.apply();

    }

}
