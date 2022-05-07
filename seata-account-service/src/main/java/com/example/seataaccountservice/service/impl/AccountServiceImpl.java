package com.example.seataaccountservice.service.impl;

import com.example.seataaccountservice.dao.AccountDao;
import com.example.seataaccountservice.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Resource
    AccountDao accountDao;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        accountDao.decrease(userId, money);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }
}

