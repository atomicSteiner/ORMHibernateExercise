package Project.Model;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


public class Stagione {


    private Long id;


    private PeriodoStagione periodo;

    private int anno;


    private List<SerieAnime> serie = new ArrayList<>();

    public Stagione() {}

    public Stagione(PeriodoStagione periodo, int anno) {
        this.periodo = periodo;
        this.anno = anno;
    }


    public void addSerieAnime(SerieAnime anime) {
        this.serie.add(anime);
        anime.setStagione(this);
    }

    public void removeSerieAnime(SerieAnime anime) {
        this.serie.remove(anime);
        anime.setStagione(null);
    }

    public Long getId() { return id; }
    public PeriodoStagione getPeriodo() { return periodo; }
    public void setPeriodo(PeriodoStagione periodo) { this.periodo = periodo; }
    public int getAnno() { return anno; }
    public void setAnno(int anno) { this.anno = anno; }
    public List<SerieAnime> getSerie() { return serie; }
    public void setSerie(List<SerieAnime> serie) { this.serie = serie; }
}
