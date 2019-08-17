package lfg.lfgfirst.Repos;

import lfg.lfgfirst.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
