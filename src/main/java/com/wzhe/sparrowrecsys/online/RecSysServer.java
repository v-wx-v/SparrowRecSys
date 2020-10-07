package com.wzhe.sparrowrecsys.online;


import com.wzhe.sparrowrecsys.online.datamanager.DataManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.net.URL;

/***
 * <p>
 *   API程序启动入口
 *  Recsys Server, end point of online recommendation service
 * </p>
 */
@SpringBootApplication
public class RecSysServer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RecSysServer.class);
    }

    public static void main(String[] args) throws Exception {


        // init dataset
        // load all the data to DataManager
        URL webRootUri = RecSysServer.class.getResource("/");
        DataManager.getInstance().loadData(webRootUri.getPath() + "sampledata/movies.csv",
                webRootUri.getPath() + "sampledata/links.csv", webRootUri.getPath() + "sampledata/ratings.csv",
                webRootUri.getPath() + "sampledata/embedding.txt", false, "i2vEmb");

        SpringApplication.run(RecSysServer.class, args);
    }

}