package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {
    @Autowired
    OSSClient ossClient;
    @Test
    void contextLoads() {
    }

@Test
    public void testUpload() throws FileNotFoundException {
            // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。

    InputStream inputStream=new FileInputStream("C:\\Users\\25149\\OneDrive\\图片\\ACG\\-64cd482e99bd7816.jpg");

    ossClient.putObject("gulimall-aimer","cartoonpicture3.jpg",inputStream);

    ossClient.shutdown();
    System.out.println("上传成功");
}}
