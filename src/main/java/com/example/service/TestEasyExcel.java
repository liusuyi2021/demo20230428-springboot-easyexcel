package com.example.service;

import com.alibaba.excel.EasyExcel;
import com.example.domain.ExcelData;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestEasyExcel
 * @Description:
 * @Author: 刘苏义
 * @Date: 2023年04月28日14:09
 * @Version: 1.0
 **/
public class TestEasyExcel {
    public static void main(String[] args) throws Exception {
        //实现excel写的操作
        // 设置写入文件夹地址和excel文件名
        String fileName = "G:\\java.xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        //write方法两个参数 ，第一个参数文件路径名称，第二个参数实体类class
        EasyExcel.write(fileName, ExcelData.class).sheet("第一个sheet").doWrite(data());
    }

    //循环设置要添加的数据，最终封装到list集合中
    private static List<ExcelData> data() {
        List<ExcelData> list = new ArrayList<ExcelData>();
        for (int i = 0; i < 10; i++) {
            ExcelData data = new ExcelData();
            data.setSno(i);
            data.setSname("dyk"+i);
            list.add(data);
        }
        return list;
    }

}
