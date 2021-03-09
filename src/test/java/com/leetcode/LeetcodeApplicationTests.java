package com.leetcode;

import com.leetcode.entity.Problem;
import com.leetcode.entity.Problemdesc;
import com.leetcode.entity.UserPerformance;
import com.leetcode.service.Problem1Service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.concurrent.ExecutionException;

//<<<<<<< HEAD
//=======
//
//>>>>>>> page3
@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {

    }
    @Autowired
    private Problem1Service service;
    @Test
    void findProblemTest(){

        System.out.println("test start");
        List<Problem> problem = service.findProblem(1, 1, null, 50, "1", null);
        for (Problem problem1 : problem) {
            System.out.println(problem1);
        }
    }
    @Test
    void performanceTest() throws ExecutionException, InterruptedException {

        UserPerformance userPerFormance = service.findUserPerFormance(1);
        System.out.println(userPerFormance);
    }

    @Test
    void findProblemDesc() throws ExecutionException, InterruptedException {
        Problemdesc problemDesc = service.findProblemDesc(0);
        System.out.println(problemDesc);
    }

}
