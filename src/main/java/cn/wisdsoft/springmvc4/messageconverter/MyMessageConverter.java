package cn.wisdsoft.springmvc4.messageconverter;

import cn.wisdsoft.springmvc4.domain.DemoObj;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * <p>ClassName: MyMessageConverter</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/6 15:15
 */
//继承AbstractHttpMessageConverter接口来实现自定义的HttpMessageConverter
public class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

    public MyMessageConverter() {
        //自定义的媒体类型Application/x-wisely
        super(new MediaType("application","x-wisely", Charset.forName("UTF-8")));
    }

    /*
     *   表明本HttpMessageConverter只处理DemoObj这个类
     */
    @Override
    protected boolean supports(Class<?> aClass) {
        return DemoObj.class.isAssignableFrom(aClass);
    }

    /*
     *   重写readInternal方法，处理请求的数据。代码表明我们处理由“-”隔开的数据，并转成DemoObj对象
     */
    @Override
    protected DemoObj readInternal(Class<? extends DemoObj> aClass, HttpInputMessage httpInputMessage) throws IOException, HttpMessageNotReadableException {
        String temp = StreamUtils.copyToString(httpInputMessage.getBody(),Charset.forName("UTF-8"));
        String [] tempArr = temp.split("-");
        return new DemoObj(new Long(tempArr[0]),tempArr[1]);
    }

    /*
     *   重写writeInternal方法，处理如何输出数据到response。此例中，我们在原样输出签名加上“hello：”
     */
    @Override
    protected void writeInternal(DemoObj obj, HttpOutputMessage httpOutputMessage) throws IOException, HttpMessageNotWritableException {
        String out = "hello:" + obj.getId() + "-" + obj.getName();
        httpOutputMessage.getBody().write(out.getBytes());
    }
}
