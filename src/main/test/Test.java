
import com.google.common.collect.Maps;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

/**
 * @author ydy
 * @version 2018/1/13  12:53
 */
public class Test {
    public static void main(String[] args) {
//        private static Logger log = LoggerFactory.getLogger(ImportExcel.class);
        Map<String,Object> map = Maps.newHashMap();
        map.put("kk", "dawdawdaw");
        Object hh = map.get("kk");
        if (hh !=null) {
            System.out.println("ddd");
            System.out.println(hh);
            System.out.println(hh);
        }
        System.out.println("kkk");
    }
}
