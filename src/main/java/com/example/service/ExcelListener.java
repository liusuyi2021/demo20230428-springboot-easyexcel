package com.example.service;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.domain.ExcelData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: ExcelListener
 * @Description:
 * @Author: 刘苏义
 * @Date: 2023年04月28日14:11
 * @Version: 1.0
 **/
//创建读取excel监听器
public class ExcelListener extends AnalysisEventListener<ExcelData> {

    //创建list集合封装最终的数据
    List<ExcelData> list = new ArrayList<ExcelData>();
    private final ArrayList<ExcelData> ExcelData = new ArrayList<ExcelData>();

    //一行一行去读取excle内容
    @Override
    public void invoke(ExcelData user, AnalysisContext analysisContext) {
        System.out.println("***"+user);
        list.add(user);
    }

    //读取excel表头信息
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头信息："+headMap);
    }

    //读取完成后执行
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    }

    public static void main(String[] args) {

        String fileName = "G:\\java.xlsx";
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        EasyExcel.read(fileName, ExcelData.class, new ExcelListener()).sheet().doRead();
    }
}