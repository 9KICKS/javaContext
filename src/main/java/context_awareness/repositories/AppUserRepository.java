package context_awareness.repositories;

import context_awareness.models.User;
import org.springframework.stereotype.Repository;

@Repository
public class AppUserRepository implements UserRepository {
    @Override
    public void save(User user) {
        System.out.println("Saving user: " + user);
    }
}
