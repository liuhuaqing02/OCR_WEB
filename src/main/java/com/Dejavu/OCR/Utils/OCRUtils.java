package com.Dejavu.OCR.Utils;

import com.baidu.aip.ocr.AipOcr;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;

public class OCRUtils {
    //设置APPID/AK/SK
    public static final String APP_ID = "41313400";
    public static final String API_KEY = "ZxDeOFXGlZHO91MXEc4VF4qB";
    public static final String SECRET_KEY = "zUzQHsPpTpWi6xlZOKU23tWLgIQHHlGd";

    public static String PicToWord(MultipartFile file) throws IOException {
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 调用接口
        JSONObject res = client.basicGeneral(file.getBytes(), new HashMap<String, String>());

        //将文字内容取出来遍历输出
        JSONArray wordsResult = res.getJSONArray("words_result");
        String result = "";   //存放输出结果
        for (int i = 0; i < wordsResult.length(); i++) {
            JSONObject jsonObject = wordsResult.getJSONObject(i);
            Object words = jsonObject.get("words");
            String s = (String) words;
            result += s + "";
        }
        return result;
    }
}
