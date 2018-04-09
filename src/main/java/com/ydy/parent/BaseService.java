package com.ydy.parent;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author ydy
 * @version 2018/1/13  15:18
 */
@Transactional(readOnly = true)
public abstract class BaseService {
}
