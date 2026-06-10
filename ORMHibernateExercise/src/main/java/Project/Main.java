package Project;

import Project.Model.PeriodoStagione;
import Project.Model.SerieAnime;
import Project.Model.Stagione;
import Project.Model.StudioAnimazione;
import Project.Repositories.StagioneRepository;
import Project.Repositories.StudioAnimazioneRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {
    // Essendo ora un componente di Spring, qui l'iniezione funziona perfettamente
    @Autowired
    private StagioneRepository stagioneRepo;

    @Autowired
    private StudioAnimazioneRepository studioRepo;
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

    }
}
