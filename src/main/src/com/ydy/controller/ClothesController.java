package com.ydy.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.alibaba.druid.util.StringUtils;
import com.ydy.entity.Clothes;
import com.ydy.service.ClothesService;
import com.ydy.utils.ImportExcel;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ydy
 * @version 2018/1/11  19:50
 */
@Controller
@RequestMapping(value="/clothes/")
public class ClothesController {

    @Autowired
    private ClothesService clothesService;

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
                    String s;
                    Row row = ei.getRow(i);
                    if (j == 0) {
                        //日期
                        Cell cell1 = row.getCell(j);
                        if (0 == cell1.getCellType()) {
                            //判断是否为日期类型
                            if (HSSFDateUtil.isCellDateFormatted(cell1)) {
                                //用于转化为日期格式
                                Date d = cell1.getDateCellValue();
                                DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
                                s = formater.format(d);
                                if (!StringUtils.isEmpty(s)) {
                                    map.put("j"+j, s);
                                }
                                continue;
                            }
                        }
                    }
                    if (j == 4 || j == 5 || j == 7 || j == 8 || j == 13) {
                        DecimalFormat df = new DecimalFormat("########");
                        Cell cell = row.getCell(j);
                        s = df.format(cell.getNumericCellValue());
                        if (!StringUtils.isEmpty(s)) {
                            map.put("j"+j, s);
                        }
                        continue;
                    }
                    s = ei.getCellValue(row, j).toString();
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

    @RequestMapping(value = "statistics")
    public String statistics() {
        Clothes clothes = new Clothes();
        clothes.setId("1");
        Clothes clothes1 = clothesService.get(clothes.getId());
        System.out.println(clothes1.getId());
        return "statistics";
    }
}
