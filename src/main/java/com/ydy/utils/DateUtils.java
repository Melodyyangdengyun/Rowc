/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.ydy.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * 日期工具类, 继承org.apache.commons.lang.time.DateUtils类
 * @author ThinkGem
 * @version 2014-4-15
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
	
	private static String[] parsePatterns = {
		"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM", 
		"yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
		"yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"};

	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd）
	 */
	public static String getDate() {
		return getDate("yyyy-MM-dd");
	}
	
	public static String getDateUk(String pattern) throws ParseException {
	       SimpleDateFormat sdf1 = new SimpleDateFormat ("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK);
	       Date date=sdf1.parse(pattern);
	       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	       String sDate=sdf.format(date);
	       return sDate;
	}
	
	public static int Dh(String time){
	    if(StringUtils.isNotBlank(time)){
			String[] my =time.split(":");
			//只有秒和毫秒，没有时分秒
			if(time.indexOf(":")<0){
				String[] secs = time.split("\\.");
				int sec = Integer.parseInt(secs[0]);
				int secm = Integer.parseInt(secs[1]);
				long totalSec =sec*1000+secm; 
				return (int)totalSec;
			}else{
			//长度为2时表示只有分秒
			if(my.length==2){
				int hour = 0;
				int min = Integer.parseInt(my[0]); 
				String secStr =(my[1]);
				//判断一下是否有毫秒，>0表示有毫秒
				if(secStr.indexOf(".")>0){
				 String[] secs = secStr.split("\\.");
				 int sec = Integer.parseInt(secs[0]);
				 int secm = Integer.parseInt(secs[1]);
				 long totalSec =hour*3600*1000+min*60*1000+sec*1000+secm;  
				 return (int)totalSec;
				}else{
				 long totalSec =hour*3600*1000+min*60*1000+Integer.parseInt(secStr)*1000;  
				 return (int)totalSec;
				}
			}else if(my.length==3){//长度为3时表示有时分秒
				int hour =Integer.parseInt(my[0]);  
				int min =Integer.parseInt(my[1]);  
				String secStr =(my[2]);
				if(secStr.indexOf(".")>0){
				String[] secs = secStr.split("\\.");
				int sec = Integer.parseInt(secs[0]);
				int secm = Integer.parseInt(secs[1]);
				long totalSec =hour*3600*1000+min*60*1000+sec*1000+secm;  
			    return (int)totalSec;
				}else{
				long totalSec =hour*3600*1000+min*60*1000+Integer.parseInt(secStr)*1000;  
				return (int)totalSec;
				}
	        }
		  }
	    }
	    	return 0;
	}

	
	/**
	 * 得到当前日期字符串 格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static int getRodom(){
		int i = (int)(Math.random()*100); 
		return i;
	}
	public static String getDate(String pattern) {
		return DateFormatUtils.format(new Date(), pattern);
	}
	
	public static String getBfNo(String pattern) {
		return "BF"+ DateFormatUtils.format(new Date(), pattern)+getRodom();
	}
	
	public static String getWxNo(String pattern) {
		return "WX"+ DateFormatUtils.format(new Date(), pattern)+getRodom();
	}
	
	public static String getRkNo(String pattern) {
		return "RK"+ DateFormatUtils.format(new Date(), pattern)+getRodom();
	}
	
	public static String getCgNo(String pattern) {
		return "CG"+ DateFormatUtils.format(new Date(), pattern);
	}
	
	public static String getYjNo(String pattern) {
		return "YJ"+ DateFormatUtils.format(new Date(), pattern);
	}
	//借用单号
	public static String getJyNo(String pattern) {
		return "JY"+ DateFormatUtils.format(new Date(), pattern);
	}
	public static String getClbfNo(String pattern) {
		return "CLBF"+ DateFormatUtils.format(new Date(), pattern);
	}
	/**
	 * 得到日期字符串 默认格式（yyyy-MM-dd） pattern可以为："yyyy-MM-dd" "HH:mm:ss" "E"
	 */
	public static String formatDate(Date date, Object... pattern) {
		String formatDate = null;
		if (pattern != null && pattern.length > 0) {
			formatDate = DateFormatUtils.format(date, pattern[0].toString());
		} else {
			formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
		}
		return formatDate;
	}
	
	/**
	 * 得到日期时间字符串，转换格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String formatDateTime(Date date) {
		return formatDate(date, "yyyy-MM-dd HH:mm:ss");
	}
	
	public static String formatDateTime1(Date date) {
		if(date==null){
			return null;
		}
		return formatDate(date, "yyyy-MM-dd");
	}

	/**
	 * 得到当前时间字符串 格式（HH:mm:ss）
	 */
	public static String getTime() {
		return formatDate(new Date(), "HH:mm:ss");
	}

	/**
	 * 得到当前日期和时间字符串 格式（yyyy-MM-dd HH:mm:ss）
	 */
	public static String getDateTime() {
		return formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 得到当前年份字符串 格式（yyyy）
	 */
	public static String getYear() {
		return formatDate(new Date(), "yyyy");
	}

	/**
	 * 得到当前月份字符串 格式（MM）
	 */
	public static String getMonth() {
		return formatDate(new Date(), "MM");
	}

	/**
	 * 得到当天字符串 格式（dd）
	 */
	public static String getDay() {
		return formatDate(new Date(), "dd");
	}

	/**
	 * 得到当前星期字符串 格式（E）星期几
	 */
	public static String getWeek() {
		return formatDate(new Date(), "E");
	}
	
	/**
	 * 日期型字符串转化为日期 格式
	 * { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", 
	 *   "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm",
	 *   "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm" }
	 */
	public static Date parseDate(Object str) {
		if (str == null){
			return null;
		}
		try {
			return parseDate(str.toString(), parsePatterns);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 获取过去的天数
	 * @param date
	 * @return
	 */
	public static long pastDays(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(24*60*60*1000);
	}

	/**
	 * 获取过去的小时
	 * @param date
	 * @return
	 */
	public static long pastHour(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(60*60*1000);
	}
	
	/**
	 * 获取过去的分钟
	 * @param date
	 * @return
	 */
	public static long pastMinutes(Date date) {
		long t = new Date().getTime()-date.getTime();
		return t/(60*1000);
	}
	
	/**
	 * 转换为时间（天,时:分:秒.毫秒）
	 * @param timeMillis
	 * @return
	 */
    public static String formatDateTime(long timeMillis){
		long day = timeMillis/(24*60*60*1000);
		long hour = (timeMillis/(60*60*1000)-day*24);
		long min = ((timeMillis/(60*1000))-day*24*60-hour*60);
		long s = (timeMillis/1000-day*24*60*60-hour*60*60-min*60);
		long sss = (timeMillis-day*24*60*60*1000-hour*60*60*1000-min*60*1000-s*1000);
		return (day>0?day+",":"")+hour+":"+min+":"+s+"."+sss;
    }
	
	/**
	 * 获取两个日期之间的天数
	 * 
	 * @param before
	 * @param after
	 * @return
	 */
	public static double getDistanceOfTwoDate(Date before, Date after) {
		long beforeTime = before.getTime();
		long afterTime = after.getTime();
		return (afterTime - beforeTime) / (1000 * 60 * 60 * 24);
	}
	
	/**
	 * 时间类型转字符串类型
	 */
	public static String getStringDate(Date time){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(time);
	}
	
	public static ArrayList<Date> getDateOfMonth(Date beginDate,Date endDate,SimpleDateFormat sdf){
		//两个日期间所有的日期e
		ArrayList<Date> dateList = new ArrayList<Date>();
		try {
			beginDate = sdf.parse(sdf.format(beginDate));
			endDate = sdf.parse(sdf.format(endDate));
			dateList.add(beginDate);//把开始时间加入集合
			    Calendar cal = Calendar.getInstance();
			    //使用给定的 Date 设置此 Calendar 的时间
			    cal.setTime(beginDate);
			    boolean bContinue = true;
			    while (bContinue) {
			        //根据日历的规则，为给定的日历字段添加或减去指定的时间量
			        cal.add(Calendar.DAY_OF_MONTH, 1);
			        // 测试此日期是否在指定日期之后
			        if (endDate.after(cal.getTime())) {
			        	dateList.add(cal.getTime());
			        } else {
			            break;
			        }
			    }
			    dateList.add(endDate);//把结束时间加入集合
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateList;
	}
	
	public static ArrayList<String> getStringDateOfMonth(Date beginDate,Date endDate,SimpleDateFormat sdf){
		//两个日期间所有的日期e
		ArrayList<String> dateList = new ArrayList<String>();
		try {
			beginDate = sdf.parse(sdf.format(beginDate));
			endDate = sdf.parse(sdf.format(endDate));
			dateList.add(sdf.format(beginDate));//把开始时间加入集合
			    Calendar cal = Calendar.getInstance();
			    //使用给定的 Date 设置此 Calendar 的时间
			    cal.setTime(beginDate);
			    boolean bContinue = true;
			    while (bContinue) {
			        //根据日历的规则，为给定的日历字段添加或减去指定的时间量
			        cal.add(Calendar.DAY_OF_MONTH, 1);
			        // 测试此日期是否在指定日期之后
			        if (endDate.after(cal.getTime())) {
			        	dateList.add(sdf.format(cal.getTime()));
			        } else {
			            break;
			        }
			    }
			    dateList.add(sdf.format(endDate));//把结束时间加入集合
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateList;
	}
	
	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
//		System.out.println(formatDate(parseDate("2010/3/6")));
//		System.out.println(getDateUk("Mon Feb 13 00:00:00 CST 2017"));
//		long time = new Date().getTime()-parseDate("2012-11-19").getTime();
//		System.out.println(time/(24*60*60*1000));
	}

	/**
	 * 获取两个日期之间的分钟
	 * @param
	 * @return
	 */
	public static long getDistanceOfTwoMinute(Date before, Date after) {
		long t = after.getTime()-before.getTime();
		return t/(60*1000);
	}
}
