package net.xaviersala;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface ColorsRepository extends CrudRepository<Color, Long> {
  
  /**
   * Cerca si un color està en la llista
   * @param nom color a cercar
   * @return Entitat Color amb les dades
   */
  Color findByCatala(String nom);

}
