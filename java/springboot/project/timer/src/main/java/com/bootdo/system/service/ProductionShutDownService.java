package com.bootdo.system.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bootdo.system.domain.ProductionShutDownDO;

@Service
public interface ProductionShutDownService {

    List<ProductionShutDownDO> productionShutDownView(Map<String, Object> map);

}
