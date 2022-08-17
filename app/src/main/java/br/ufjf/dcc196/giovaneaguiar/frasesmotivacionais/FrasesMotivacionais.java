package br.ufjf.dcc196.giovaneaguiar.frasesmotivacionais;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "frasesmotivacionais")
public class FrasesMotivacionais {
    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "frase")
    private String frase;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
}
