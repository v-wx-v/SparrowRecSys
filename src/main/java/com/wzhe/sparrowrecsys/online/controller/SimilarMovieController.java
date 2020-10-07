package com.wzhe.sparrowrecsys.online.controller;


import com.wzhe.sparrowrecsys.online.datamanager.Movie;
import com.wzhe.sparrowrecsys.online.recflow.SimilarMovieFlow;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  Similar Movie Controller API
 * </p>
 *
 * @author wxx
 */
@RestController
@RequestMapping("/")
public class SimilarMovieController {

    @GetMapping("/getsimilarmovie")
    public Object getById(Integer movieId, Integer size, String model) {

        //get movie object from DataManager
        return SimilarMovieFlow.getRecList(movieId, size, model);
    }
}
