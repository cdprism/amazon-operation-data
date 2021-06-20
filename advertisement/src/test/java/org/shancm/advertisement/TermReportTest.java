package org.shancm.advertisement;

import org.junit.jupiter.api.Test;
import org.shancm.advertisement.service.ITermReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @Classname TermReportTest
 * @Description TODO
 * @Date 2021/6/2 18:25
 * @Created by S.cm
 */
@SpringBootTest
public class TermReportTest {

    @Autowired
    private ITermReportService termReportService;

    @Test
    public void run(){
        termReportService.queryAll();
    }


    public static void main(String[] args) {

    }
}
