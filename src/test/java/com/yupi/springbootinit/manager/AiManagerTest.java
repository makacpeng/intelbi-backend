package com.yupi.springbootinit.manager;

import org.bouncycastle.asn1.cms.PasswordRecipientInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;

    @Test
    void doChat() {
        String answer = aiManager.sendMsgToXingHuo(true, "分析");
        System.out.println(answer);
    }
}