package cn.wisdsoft.spring4.ch3.conditional;

/**
 * <p>ClassName: WindowsListService</p>
 * <p>Description:</p>
 *
 * @author 孙伟光
 * @version 1.0
 * @date 2018/11/1 20:57
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
