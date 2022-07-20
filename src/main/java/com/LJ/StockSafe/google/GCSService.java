package com.LJ.StockSafe.google;

import com.google.cloud.storage.Acl;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import com.google.cloud.storage.Blob;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class GCSService {

    @Autowired
    Storage storage;

    public Blob downloadFileFromGCS(DownloadReqDto downloadReqDto) {

        String bucketname = downloadReqDto.getBucketName();

        Blob blob = storage.get( bucketname, downloadReqDto.getDownloadFileName());
        blob.downloadTo(Paths.get( downloadReqDto.getLocalFileLocation()));
        return blob;
    }

    @SuppressWarnings("deprecation")
    public BlobInfo uploadFileToGCS(UploadReqDto uploadReqDto) throws IOException {

        System.out.println(uploadReqDto.getUploadFileName());
        System.out.println(uploadReqDto.getBucketName());
        System.out.println(uploadReqDto.getLocalFileLocation());

//        Map<String, String> m = new HashMap<>();
//        m.put("contentType", "image/jpeg");

        BlobInfo blobInfo = storage.create(
                BlobInfo.newBuilder(uploadReqDto.getBucketName(), uploadReqDto.getUploadFileName())
                        .setContentType("image/jpeg")
//                        .setMetadata( m )
//                        .setAcl(new ArrayList<>(Arrays.asList(Acl.of(Acl.User.ofAllAuthenticatedUsers(), Acl.Role.READER))))
                        .build(),
                new FileInputStream(uploadReqDto.getLocalFileLocation()));

        return blobInfo;
    }

}