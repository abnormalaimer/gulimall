package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Autowired
    CategoryService categoryService;

    @Test
    public void test() {
        Long[] cate = categoryService.findCatelogPath(225L);
        log.info("225:21212121{}", Arrays.asList(cate));
    }

//    @Autowired
//    OSSClient ossClient;
//@Test
//    public void testUpload() throws FileNotFoundException {
//            // Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//
//    InputStream inputStream=new FileInputStream("C:\\Users\\25149\\OneDrive\\图片\\ACG\\-1ec8f238371ca11b.jpg");
//
//    ossClient.putObject("gulimall-aimer","cartoonpicture2.jpg",inputStream);
//
//    ossClient.shutdown();
//    System.out.println("上传成功");


    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("小米");
        System.out.println("保存成功");
        brandService.updateById(brandEntity);
    }

}
