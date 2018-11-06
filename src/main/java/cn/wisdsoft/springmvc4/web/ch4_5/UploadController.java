package cn.wisdsoft.springmvc4.web.ch4_5;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * <p>ClassName: UploadController</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/6 14:40
 */
@Controller
public class UploadController {
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String upload(MultipartFile file){ //MultipartFile接受的上传文件
        try {
            //使用FileUtils.writeByteArrayToFile快速写文件到磁盘
            FileUtils.writeByteArrayToFile(new File("e:/upload/"+file.getOriginalFilename()),
                    file.getBytes());
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "wrong";
        }
    }
}
