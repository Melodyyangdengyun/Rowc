package com.ydy.controller;

import java.io.IOException;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.druid.support.json.JSONUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import com.ydy.entity.Clothes;
import com.ydy.service.ClothesService;
import com.ydy.utils.ImportExcel;

import sun.security.util.Length;

/**
 * @author ydy
 * @version 2018/1/11  19:50
 */
@Controller
@RequestMapping(value = "/clothes/")
public class ClothesController {
    @Autowired
    private ClothesService clothesService;

    @RequestMapping(value = "listAll")
    public String listAll(Model model) {
//      List<Map<String,Object>> listAll = clothesService.findListAll();
        Map<String, Object> map = Maps.newHashMap();
        List<Map<String, Object>> list = Lists.newArrayList();
        map.put("id", "666");
        list.add(map);
        String json = JSONUtils.toJSONString(list);
        model.addAttribute("json", json);
        return "clothesListAll";
    }

    @RequestMapping(value = "listAll2")
    @ResponseBody
    public String listAll2(Model model) {
        Map<String, Object> map = Maps.newHashMap();
        List<Map<String, Object>> list = Lists.newArrayList();
        map.put("id", "666");
        list.add(map);
        String cols = JSONUtils.toJSONString(list);
        cols = cols.substring(1, cols.length());
        cols = cols.substring(0, cols.length() - 1);
        return cols;
    }

    @RequestMapping(value = "statistics")
    public String statistics(Clothes clothes) {
//      clothes.setId("1");
//      Clothes clothes1 = clothesService.get(clothes.getId());
//      System.out.println(clothes1.getId());
        clothes.setColour("黄色");
        clothes.setCompany("件");
        clothes.setHead("我");
        clothes.setLengthd("156");
        clothes.setManagers("不知道");
        clothes.setNumberd("5");
        clothes.setOffice("珠海");
        clothes.setPaymentState("未收到");
        clothes.setPhone("18926725135");
        clothes.setPrice("30");
        clothes.setRegisterDate("2017/2/1");
        clothes.setSized("M");
        clothes.setStyle("短袖");
        clothes.setTotal("150");
        clothesService.save(clothes);
        return "index";
    }

    @RequestMapping(value = "go")
    public String test(String name, Model model) {
        model.addAttribute("ceshi", "18926725435");
        model.addAttribute("name", name);

        return "index2";
    }

    /**
     * excel文件解析返回
     *
     * @param excelFile 文件
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public String uploading(@RequestParam("excelFile") MultipartFile excelFile, HttpServletRequest request,
                            ModelMap model) {
        try {
            ImportExcel ei = new ImportExcel(excelFile, 1, 0);
            int lastDataRowNum = ei.getLastDataRowNum();
            int lastCellNum = ei.getLastCellNum();
            Map<String, Object> titleMap = Maps.newHashMap();
            for (int k = 0; k < lastCellNum; k++) {
                Row row = ei.getRow(0);
                String s = ei.getCellValue(row, k).toString();
                titleMap.put("k" + k, s);
            }
            List<Map<String, Object>> maps = Lists.newArrayList();
            DateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
            for (int i = 1; i < lastDataRowNum; i++) {
                Map<String, Object> map = Maps.newHashMap();
                for (int j = 0; j < lastCellNum; j++) {
                    Row row = ei.getRow(i);
                    if ((j == 4) || (j == 5) || (j == 7) || (j == 8) || (j == 13)) {
//                      DecimalFormat df = new DecimalFormat("########");
                        Cell cell = row.getCell(j);
                        if (cell != null) {
                            DecimalFormat df = new DecimalFormat("0");
                            String whatYourWant = df.format(cell.getNumericCellValue());
                            map.put("j" + j, whatYourWant);
                        }
                        continue;
                    }
                    if (j == 0) {
                        Cell dateCell = row.getCell(0);
                        if (dateCell != null) {
                            Date dateCellValue = dateCell.getDateCellValue();

                            if (dateCellValue != null) {
                                map.put("j" + j, formater.format(dateCellValue));
                            }
                        }
                        continue;
                    }
                    Object cellValue = ei.getCellValue(row, j);
                    if (cellValue != null) {
                        String s1 = cellValue.toString();
                        if (!s1.trim().equals("")) {
                            map.put("j" + j, s1);
                            continue;
                        }
                    }
                }
                maps.add(map);
            }

            for (Map<String, Object> map : maps) {
                Clothes clothes = new Clothes();
                Object j0 = map.get("j0");
                Object j1 = map.get("j1");
                Object j2 = map.get("j2");
                Object j3 = map.get("j3");
                Object j4 = map.get("j4");
                Object j5 = map.get("j5");
                Object j6 = map.get("j6");
                Object j7 = map.get("j7");
                Object j8 = map.get("j8");
                Object j9 = map.get("j9");
                Object j10 = map.get("j10");
                Object j11 = map.get("j11");
                Object j12 = map.get("j12");
                Object j13 = map.get("j13");

                if (j0 != null) {

                    // 登记日期
                    clothes.setRegisterDate(j0.toString());
                }

                if (j1 != null) {
                    clothes.setColour(j1.toString());
                }

                if (j2 != null) {
                    clothes.setStyle(j2.toString());
                }

                if (j3 != null) {
                    clothes.setSized(j3.toString());
                }

                if (j4 != null) {
                    clothes.setLengthd(j4.toString());
                }

                if (j5 != null) {
                    clothes.setNumberd(j5.toString());
                }

                if (j6 != null) {
                    clothes.setCompany(j6.toString());
                }

                if (j7 != null) {
                    clothes.setPrice(j7.toString());
                }

                if (j8 != null) {
                    clothes.setTotal(j8.toString());
                }

                if (j9 != null) {
                    clothes.setPaymentState(j9.toString());
                }

                if (j10 != null) {
                    clothes.setOffice(j10.toString());
                }

                if (j11 != null) {
                    clothes.setHead(j11.toString());
                }

                if (j12 != null) {
                    clothes.setManagers(j12.toString());
                }

                if (j13 != null) {
                    clothes.setPhone(j13.toString());
                }

                clothesService.save(clothes);
            }

            model.addAttribute("maps", maps);
            model.addAttribute("map", titleMap);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "idnex3";
    }
}
