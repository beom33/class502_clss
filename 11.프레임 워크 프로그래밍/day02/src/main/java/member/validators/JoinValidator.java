package member.validators;


import global.validators.Validator;
import member.controllers.RequestJoin;
import member.dao.MemberDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class JoinValidator implements Validator<RequestJoin> {

    private MemberDao memberDao; // 설명

    @Autowired
    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void check(RequestJoin form) {

    }
}
