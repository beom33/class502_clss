package org.choongang.global.validators;

public interface RequiredValidator {
    default void checkRequried(String str, RuntimeException e){
        if (str == null || str.isBlank()){
            throw e;
        }
    }

    //참 인지 체크
    default void checkTrue(boolean checked, RuntimeException e) {
        if (!checked) {
            throw e;
        }
    }
}
