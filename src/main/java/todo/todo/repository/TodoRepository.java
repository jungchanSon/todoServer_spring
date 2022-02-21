package todo.todo.repository;

import org.springframework.stereotype.Repository;
import todo.todo.domain.Todo;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TodoRepository {

    private EntityManager em;

    public void save(Todo todo){
        em.persist(todo);
    }

    public Todo findOne(Long id) {
        return em.find(Todo.class, id);
    }

    public List<Todo> findAll() {
        return em.createQuery("select t from Todo t", Todo.class).getResultList();
    }

}
