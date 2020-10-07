package com.wzhe.sparrowrecsys.online.controller;


import com.wzhe.sparrowrecsys.online.datamanager.DataManager;
import com.wzhe.sparrowrecsys.online.datamanager.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * <p>
 *  Movie Controller
 * </p>
 *
 * @author wxx
 */
@RestController
@RequestMapping("/")
public class MovieController {

    @GetMapping("/getmovie")
    public Object getById(Integer id) {

        //get movie object from DataManager
        return DataManager.getInstance().getMovieById(id);
    }
}
