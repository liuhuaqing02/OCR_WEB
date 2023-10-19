package com.Dejavu.OCR.Controller;

import com.Dejavu.OCR.Utils.OCRUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class AiController {
//   pic为前端与后端的接口
    @RequestMapping(value = "/pic", method = RequestMethod.POST)
//  接收图片调用方法
    public static String PicToWord(@RequestParam("file") MultipartFile file) throws IOException {
        String res = OCRUtils.PicToWord(file);
//      成功执行后在Java控制台中打印内容
        System.out.println(res);
        return res;
    }
}
