package com;

/**
 * @Author: hqf
 * @description:
 * @Data: Create in 19:42 2019/11/19
 * @Modified By:
 */
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String SayHello(String word) {
        return "hello2" + word;
    }
}
