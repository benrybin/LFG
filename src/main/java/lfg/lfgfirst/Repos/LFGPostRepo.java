package lfg.lfgfirst.Repos;

import lfg.lfgfirst.Models.Games;
import lfg.lfgfirst.Models.LFGPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LFGPostRepo extends JpaRepository<LFGPost,Integer> {
}
