package com.york.designpattern.template;

/**
 * @author york
 * @create 2020-06-22 11:07
 **/
public class CallbackTest {

    public static void main(String[] args) {
        BClass bClass = new BClass();
        bClass.process(new ICallback() {
            public void methodCallback() {
                System.out.println("回调");
            }
        });
    }
}
