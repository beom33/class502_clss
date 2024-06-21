package org.choongang.member.services;


import jakarta.servlet.http.HttpServletRequest;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.member.mapper.MemberMapper;
import org.mindrot.jbcrypt.BCrypt;

import javax.xml.validation.Validator;
import java.lang.reflect.Member;

// 회원가입 기능
public class JoinService {

    private Validator<RequestJoin> validator;
    private MemberMapper mapper;

    public JoinService(Validator<RequestJoin> validator, MemberMapper mapper) {
        this.validator = validator;
        this.mapper = mapper;
    }

    public void process(RequestJoin form) {

        //유효성 검사
        validator.check(form);

        //비밀번호 해시화 - BCrypt
        String hash = BCrypt.hashpw(form.getPassword(), BCrypt.gensalt(12));

        Member member = new Member();
        member.setEmail(form.getEmail());
        member.setPassword(hash);
        member.setUserName(form.getUserName());

        int result = mapper.register(member);
        if (result < 1) {
            throw new BadRequestException("회원가입에 실패하였습니다.");
        }

    }

    public void process(HttpServletRequest request) {
        // Object.requiredNonNullElse(객체, null일때 기본값);
        String _termsAgree = Object.requireNonNullElse(request.getParameter("termsAgree"), "false");

        RequestJoin form = RequestJoin.builder()
                .email(request.getParameter("email"))
                .password(request.getParameter("password"))
                .confirmPassword(request.getParameter("confirmPassword"))
                .userName(request.getParameter("userName"))
                .termsAgree(_termsAgree)
                .build();

        process(form);
    }
}
