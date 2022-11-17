package com.example.bugcheck.controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;
import static com.example.bugcheck.utils.Global.SUCCESS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.mock.web.MockMultipartFile;



//@RunWith(DataController.class)
@SpringBootTest
class DataControllerTest {
    @Autowired
    DataController dc;

    @PostMapping("/upload")
    @ResponseBody
    @Test
    void draftContract() throws IOException {
//         File file = new File("D:\\gitfile\\bug_test_project\\bugcheck\\src\\main\\java\\com\\example\\bugcheck\\file\\JDT.csv");
//         FileItemFactory factory = new DiskFileItemFactory(16, null);
//         FileItem item=factory.createItem(file.getName(),"text/plain",true,file.getName());
//         MultipartFile multipartFile = new CommonsMultipartFile (item);
//        MultipartFile path=new CommonsMultipartFile(item);
//        File file = new File("D:\\gitfile\\bug_test_project\\bugcheck\\src\\main\\java\\com\\example\\bugcheck\\file\\JDT.csv\"");
//
//       //File文件转MultipartFile
//        FileInputStream input = new FileInputStream(file);
//        MultipartFile multipartFile = new MockMultipartFile("file", file.getName(), "text/plain", IOUtils.toByteArray(input));

//        String strUrl ="D:\\gitfile\\bug_test_project\\bugcheck\\src\\main\\java\\com\\example\\bugcheck\\file\\JDT.csv" ;
//        File file = new File(strUrl);
//        InputStream inputStream = new FileInputStream(file);
//        MultipartFile multipartFile = new MockMultipartFile(file.getName(), inputStream);
//        assertEquals(SUCCESS,dc.draftContract(multipartFile));
    }

    @Test
    void calculateResult() {
        assertEquals(String.valueOf(SUCCESS),dc.calculateResult("KNN"));
    }
}
