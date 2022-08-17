package br.ufjf.dcc196.giovaneaguiar.frasesmotivacionais;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface FrasesMotivacionaisDAO {

    @Insert
    void insertFrasesMotivacionais(FrasesMotivacionais novaFrase);
    @Query("SELECT * FROM frasesmotivacionais")
    List<FrasesMotivacionais> findAll();


}
