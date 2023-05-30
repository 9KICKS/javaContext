package context_awareness.repositories;

import context_awareness.models.User;

public interface UserRepository {
    void save(User user);
}
