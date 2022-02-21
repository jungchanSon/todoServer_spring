package todo.todo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter @Setter
public class MemberTeam {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Team team;
}
