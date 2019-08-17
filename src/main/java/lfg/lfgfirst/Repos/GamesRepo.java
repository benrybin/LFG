package lfg.lfgfirst.Repos;

import lfg.lfgfirst.Models.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamesRepo extends JpaRepository<Games,Integer> {



}
