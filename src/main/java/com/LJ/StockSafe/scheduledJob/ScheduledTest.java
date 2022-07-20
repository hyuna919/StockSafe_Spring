package com.LJ.StockSafe.scheduledJob;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;
import java.util.List;


@Component
public class ScheduledTest {

    @Scheduled(cron = "0 * * * * ?")
    public void printTest(){
        long now = System.currentTimeMillis() / 1000;
        System.out.println("Time is " + now);

        Storage storage = StorageOptions.getDefaultInstance().getService();

        String bucketname = "stocksafe_storage";
//        String filename = "img/testyo1.png";
//        String localFileLocation = "C:/Users/Jung Hyun Lee/Desktop/projectyo/StockSafe_Spring/src/main/resources/keystore/que1.png";
//
        //Blob blob = storage.get( bucketname, filename);
//        blob.downloadTo(Paths.get( localFileLocation));

//        System.out.println("down success.");


        Page<Bucket> bucketList = storage.list();

        for (Bucket bucket : bucketList.iterateAll()) {
            System.out.println(bucket.toString());
//            System.out.println(bucket.getName());
            Page<Blob> itemList = storage.list(bucket.getName());

            for (Blob item: itemList.iterateAll()) {
                System.out.println(item.toString());
            }

        }



    }

}