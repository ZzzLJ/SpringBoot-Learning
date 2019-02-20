package com.systemprovider.service;

import org.springframework.stereotype.Service;

/**
 * @Author: ZzzLJ
 */
@Service
public interface TestService {
    public String queue();

    public String topic();

    public String redis();
}
