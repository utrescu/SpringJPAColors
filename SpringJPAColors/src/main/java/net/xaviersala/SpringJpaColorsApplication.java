package net.xaviersala;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaColorsApplication implements CommandLineRunner{ 
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaColorsApplication.class, args);
    }

    @Autowired
    ColorsRepository colorsRepository;
    
    @Override
    public void run(String... arg0) throws Exception {
      
      
      System.out.println("... Afegint colors \n\n");
      colorsRepository.save(new Color("vermell", "rojo", "rouge", "red"));
      colorsRepository.save(new Color("groc", "amarillo", "jaune", "yellow"));
      colorsRepository.save(new Color("blau", "azul", "bleu", "blue"));
      colorsRepository.save(new Color("blanc", "blanco", "blanc", "white"));
      colorsRepository.save(new Color("negre", "netro", "noir", "black"));
      
      System.out.println("... Llistant tots els colors:");
      List<Color> colors = (List<Color>) colorsRepository.findAll();
      
      for(Color c: colors) {
        System.out.println("Color: " + c);
      }
            
      System.out.println("\n\n ... Cercant el color 'blau' : ");
      Color d = colorsRepository.findByCatala("blau");
      if (d == null) {
        System.out.println("No hi ha blau");
      } else {
        System.out.println("Trobat '" + d + "'");
      }
      
      
    }
}
