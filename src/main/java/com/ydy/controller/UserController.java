package com.ydy.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.alibaba.druid.util.StringUtils;
import com.ydy.utils.ImportExcel;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ydy
 * @version 2018/1/11  19:50
 */
@Controller
@RequestMapping(value="/user/")
public class UserController {

    @RequestMapping(value = "go")
    public String test(String name, Model model) {
        model.addAttribute("ceshi", "18926725435");
        model.addAttribute("name", name);
        return "index2";
    }

    /**
     * excel文件解析返回
     * @param excelFile 文件
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "upload",method = RequestMethod.POST)
    public String uploading(@RequestParam("excelFile") MultipartFile  excelFile, HttpServletRequest request, ModelMap model) {
        try {
            ImportExcel ei = new ImportExcel(excelFile, 1, 0);
            int lastDataRowNum = ei.getLastDataRowNum();
            int lastCellNum = ei.getLastCellNum();
            Map<String,Object> titleMap = Maps.newHashMap();
            for (int k = 0; k < lastCellNum; k++) {
                Row row = ei.getRow(0);
                String s = ei.getCellValue(row, k).toString();
                titleMap.put("k"+k, s);
            }
            List<Map<String,Object>> maps = Lists.newArrayList();
            for (int i = 1; i < lastDataRowNum; i++) {
                Map<String,Object> map = Maps.newHashMap();
                for (int j = 0; j < lastCellNum; j++) {
                    Row row = ei.getRow(i);
                    String s = ei.getCellValue(row, j).toString();
                    if (!StringUtils.isEmpty(s)) {
                        map.put("j"+j, s);
                    }
                }
                maps.add(map);
            }
            model.addAttribute("maps", maps);
            model.addAttribute("map", titleMap);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index";
    }
}
