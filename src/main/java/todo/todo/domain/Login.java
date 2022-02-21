package todo.todo.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Login {
    private String loginId;
    private String loginPw;

    protected Login(){
    }

    public Login(String loginId, String loginPw){
        this.loginId = loginId;
        this.loginPw = loginPw;
    }

}
