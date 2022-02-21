package todo.todo.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import todo.todo.domain.Todo;
import todo.todo.repository.TodoRepository;

import java.util.List;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    @Transactional
    public void saveTodo(Todo todo) {
        todoRepository.save(todo);
    }

//    @Transactional
//    public void updateItem(params) {}

    public List<Todo> findTodos() {
        return todoRepository.findAll();
    }

    public Todo findTodo(Long id) {
        return todoRepository.findOne(id);
    }
}
