package com.example.aishuatiserver.service;

import com.example.aishuatiserver.JavaBean.Problem;
import com.example.aishuatiserver.mapper.ProblemMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProblemServoceTests {
    @Autowired
    private ProblemService problemService;

    @Test
    public void getMyAllChoiceProblemCount(){
        System.out.println(problemService.getMyAllChoiceProblemCount(2));
    }

    @Test
    public void getMyAllSubjectiveProblemCount(){
        System.out.println(problemService.getMyAllSubjectiveProblemCount(1));
    }

    @Test
    public void getSearchChoiceCount(){
        System.out.println(problemService.getSearchChoiceCount(1,"大学物理",null));
    }


    @Test
    public void addChoiceProblem(){
        problemService.addChoiceProblem("大学物理",1,1,3,"设F(X)定义域为(1,2),则F(lgx)的定义域为",2,
                "(0,lg2)","(0,lg2]","(10,100)","(1,2)","无解析");
    }

    @Test
    public void getAllChoiceProblemInfo(){
        System.out.println(problemService.getAllChoiceProblemInfo(2,1,10));
    }

    @Test
    public void getAllSubjectiveProblemInfo(){
        System.out.println(problemService.getAllSubjectiveProblemInfo(
                2,1,20
        ));
    }

    @Test
    public void updateSigleProblemById(){
        Problem problem = new Problem();
        problem.setProblemId(13);
        problem.setChoice_A("1");
        problem.setChoice_B("2");
        problem.setChoice_C("3");
        problem.setChoice_D("4");
        problem.setInfo_text_content("微积分简单吗");
        problem.setDifficult(1);
        problem.setCorrect(1);
        problem.setReference("wu");
        int rows = problemService.updateSingleProblemById(problem);
        Assert.assertEquals(rows,1,1);
    }
}
