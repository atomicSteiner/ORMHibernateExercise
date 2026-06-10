package Project.Model;
import jakarta.persistence.*;

public class SerieAnime {


    private Long id;


    private String titolo;

    private int numeroEpisodi;


    private Stagione stagione;


    private StudioAnimazione studioAnimazione;

    public SerieAnime() {}

    public SerieAnime(String titolo, int numeroEpisodi) {
        this.titolo = titolo;
        this.numeroEpisodi = numeroEpisodi;
    }

    public Long getId() { return id; }
    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }
    public int getNumeroEpisodi() { return numeroEpisodi; }
    public void setNumeroEpisodi(int numeroEpisodi) { this.numeroEpisodi = numeroEpisodi; }
    public Stagione getStagione() { return stagione; }
    public void setStagione(Stagione stagione) { this.stagione = stagione; }
    public StudioAnimazione getStudioAnimazione() { return studioAnimazione; }
    public void setStudioAnimazione(StudioAnimazione studioAnimazione) { this.studioAnimazione = studioAnimazione; }
}
