package com.gz.advance.condition;

/**
 * @author xiaozefeng
 */
public class LinuxListSerice implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
