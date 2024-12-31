package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TestController.class)
class TestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHelloWorldEndpoint() throws Exception {
        mockMvc.perform(get("/")) // 기본 경로로 GET 요청
            .andExpect(status().isOk()) // HTTP 상태가 200인지 확인
            .andExpect(content().string("Hello, World")); // 반환된 내용 확인
    }
}
