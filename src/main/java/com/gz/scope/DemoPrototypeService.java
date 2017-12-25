package com.gz.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author xiaozefeng
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
