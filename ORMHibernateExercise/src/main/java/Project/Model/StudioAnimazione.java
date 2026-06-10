package Project.Model;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


public class StudioAnimazione {


    private Long id;


    private String nome;

    private List<SerieAnime> serieProdotte = new ArrayList<>();

    public StudioAnimazione() {}

    public StudioAnimazione(String nome) {
        this.nome = nome;
    }

    public void addSerie(SerieAnime anime) {
        this.serieProdotte.add(anime);
        anime.setStudioAnimazione(this);
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public List<SerieAnime> getSerieProdotte() { return serieProdotte; }
    public void setSerieProdotte(List<SerieAnime> serieProdotte) { this.serieProdotte = serieProdotte; }
}