package exam01;

import config.AppCtx;
import member.controllers.RequestJoin;
import member.services.InfoService;
import member.services.JoinService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext
                (AppCtx.class);

        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form =RequestJoin.builder()
                .email("user01@test.org")
                .password("123456787")
                .confirmPassword("12345678")
                .userName("팜하니")
                .build();

        joinService.process(form);
        infoService.printList();

        ctx.close();
    }
}
