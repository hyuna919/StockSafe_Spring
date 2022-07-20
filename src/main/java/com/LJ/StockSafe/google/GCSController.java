package com.LJ.StockSafe.google;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/gcs")
@RequiredArgsConstructor
public class GCSController {

    @Autowired
    GCSService gcsService;

    @GetMapping("/gg")
    public ResponseEntity gett(){
        return ResponseEntity.ok("hello");
    }


    @PostMapping("/download")
    public ResponseEntity localDownloadFromStorage(@RequestBody DownloadReqDto downloadReqDto){
        Blob fileFromGCS = gcsService.downloadFileFromGCS(downloadReqDto);
        return ResponseEntity.ok(fileFromGCS.toString());
    }


    @PostMapping("/upload")
    public ResponseEntity localUploadToStorage(@RequestBody UploadReqDto uploadReqDto) throws IOException {
        BlobInfo fileFromGCS = gcsService.uploadFileToGCS(uploadReqDto);
        return ResponseEntity.ok(fileFromGCS.toString());
    }
}