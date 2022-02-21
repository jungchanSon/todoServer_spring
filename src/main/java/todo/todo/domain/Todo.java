package todo.todo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter @Getter
public class Todo {

    @Id @GeneratedValue
    @Column(name = "todo_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private TodoType todoType;

    private String title;

    private String manager;

    private String content;

    private String deadline;

    private String createDate;

    private String dueDate;
}
