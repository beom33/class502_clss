package org.choongang.member.exceptions;

import org.choongang.global.exceptions.BadRequestException;

public class DuplicatedMemberException extends BadRequestException {
    public DuplicatedMemberException() {
        super("이미 가입된 회원 입니다.");

    }
}
