package com.bootdo.system.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.bootdo.system.domain.FmaterialJobDO;
import com.bootdo.system.domain.PunchingOutsourceDO;
import com.bootdo.system.domain.PurchasePriceDO;
import com.bootdo.system.domain.PurchasePriceTmpDO;

@Service
public interface PunchingOutsourceService {

    List<PunchingOutsourceDO> list(Map<String, Object> map);
}
