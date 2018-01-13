import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * @author ydy
 * @version 2018/1/13  12:53
 */
public class Test {
    public static void main(String[] args) {
        List<Map<String,Object>> maps = Lists.newArrayList();
        for (int i = 0; i < 10; i++) {
            Map<String,Object> map = Maps.newHashMap();
            for (int j = 0; j < 10; j++) {
                map.put("k" + i,j);
            }
            maps.add(map);
        }

        for (Map<String, Object> map : maps) {
            String s = map.get("k2").toString();

        }

    }
}
