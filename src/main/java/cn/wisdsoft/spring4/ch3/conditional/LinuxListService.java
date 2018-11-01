package cn.wisdsoft.spring4.ch3.conditional;

/**
 * <p>ClassName: LinuxListService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/1 20:58
 */
public class LinuxListService implements  ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
