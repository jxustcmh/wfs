package com.hx.wfs.city.data.controller;

import com.hx.wfs.city.data.model.City;
import com.hx.wfs.city.data.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @author jxlgcmh
 * @date 2019-10-22 11:01
 */
@RestController
public class CityDataController {

    @Autowired
    private CityService cityService;

    @RequestMapping("cities")
    public List<City> getAllCity() {
       return cityService.selectAll();
    }
}
