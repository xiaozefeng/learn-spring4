package com.gz.profile;

/**
 * @author xiaozefeng
 */
public class DemoBean {
    private String content;

    public DemoBean(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "DemoBean{" +
                "content='" + content + '\'' +
                '}';
    }
}
