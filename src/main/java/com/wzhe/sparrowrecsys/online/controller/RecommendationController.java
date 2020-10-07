package com.wzhe.sparrowrecsys.online.controller;


import com.wzhe.sparrowrecsys.online.datamanager.DataManager;
import com.wzhe.sparrowrecsys.online.datamanager.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *   Recommendation Controller API
 * </p>
 *
 * @author wxx
 */
@RestController
@RequestMapping("/")
public class RecommendationController {

    @GetMapping("/getrecommendation")
    public Object getById(String genre, Integer size, String sortby) {

        try {
            //get movie object from DataManager
            return DataManager.getInstance().getMoviesByGenre(genre, size, sortby);
        }catch (Exception e){
            System.err.println(e);
        }
        return "";
    }
}
