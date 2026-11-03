package br.com.alura.screenmatch2;

import br.com.alura.screenmatch2.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Screenmatch2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Screenmatch2Application.class, args);
		var apiKey = System.getenv("OMDB_API_KEY");
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var apiKey = System.getenv("OMDB_API_KEY");
		var json = consumoApi.obterDados(
				"https://www.omdbapi.com/?t=gilmore+girls&apikey=" + apiKey
		);
		System.out.println(json);
		//json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		//System.out.println(json);

	}
}
