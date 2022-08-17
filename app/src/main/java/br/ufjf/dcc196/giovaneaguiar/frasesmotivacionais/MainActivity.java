package br.ufjf.dcc196.giovaneaguiar.frasesmotivacionais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    FrasesRepository repo;
    TextView textViewFrases;

    String[] frases = {"Nunca mude para agradar os outros.\n\n" +
            "A cara de deboche do Ash já diz tudo: cada um tem o seu jeitinho! Não vale a pena " +
            "forçar um personagem que não condiz com os seus valores, crenças e personalidade " +
            "para tentar se encaixar. Apenas seja você!",
            "Você tem o poder de construir seu próprio caminho.\n\n" + "Você vai querer ouvir um " +
                    "dos Pokémon mais fortes que existe: a frase de Mewtwo é bem clara: não " +
                    "importa de onde você veio, mas sim as suas escolhas.",
            "Já pensou que duas perspectivas de um mesmo problema podem estar corretas?\n\n" +
                    "Um viajante solitário como Alder sabe usar sábias palavras para tirar " +
                    "qualquer um da zona de conforto: abra os olhos para novas perspectivas!",
            "É possível ganhar de forma incorreta ou perder dignamente - aprenda a distinguir " +
                    "os dois!\n\n" +
                    "As nossas conquistas serão sempre determinadas pela nossa forma de chegar " +
                    "até elas. Você se orgulha do caminho que traçou até conquistar ou " +
                    "perder algo? Isso conta muito!",
            "Pokémon e romance: o amor conta mais que tudo!\n\n" +
                    "A imprevisível e charmosa Misty é uma das personagens mais emotivas e" +
                    " fofas de Pokémon, seus ataques de “amor” deixam muito claro qual é o " +
                    "sentimento mais importante do mundo para ela!",
            "Sempre que necessário, coloque limites (ainda mais se você for uma mulher).\n\n" +
                    "Tem que ter coragem para se colocar na frente de Misty quando ela está " +
                    "irritada (quase sempre). Sua personalidade forte e apaixonada deixa bem " +
                    "claro que, vivendo em um mundo de maioria masculina, é necessário mostrar " +
                    "sua palavra importa!"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        repo = new FrasesRepository(getApplicationContext());
        //frases = repo.getFrases();
        //textViewFrases.setText(repo.getFrases());

    }


    public void mudarFrase(View view) {

        textViewFrases = findViewById(R.id.textViewFrases);

        int n = new Random().nextInt(frases.length);
        //resgatar uma posição da string de maneira randômica

        textViewFrases.setText(frases[n]);
        //repo.setFrases(frases[n]);

    }

}