package com.lzr.ls.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lzr.ls.dao.CustomerTableDao;
import com.lzr.ls.entity.CustomerTable;
import com.lzr.ls.service.CustomerTableService;
import org.springframework.stereotype.Service;

/**
 * (CustomerTable)表服务实现类
 *
 * @author makejava
 * @since 2022-02-23 21:35:16
 */
@Service("customerTableService")
public class CustomerTableServiceImpl extends ServiceImpl<CustomerTableDao, CustomerTable> implements CustomerTableService {

}

