package rpc.service;

/**
 * @author: 小山
 * @date: 2023/2/21 17:14
 * @content:
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String msg) {
        int i = 1/0;
        return "hello,"  + msg;
    }
}
