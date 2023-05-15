package com.ly.orderService.controller;

import com.ly.orderService.common.result.Result;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.websocket.server.PathParam;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author LY
 * @Title: com.ly.orderService.controller
 * @Description: 描述
 * @date 2023/5/12 15:50
 */
@RestController
@Api(tags = "文件管理模块")
@RequestMapping("/uploadController")
public class FileUploadController {

    @Operation(summary = "文件上传")
    @PostMapping("fileUpload")
    public Result<Void> fileUpload(@PathParam("file") MultipartFile file) throws IOException {
        // 获取上传的文件名
        String fileName = file.getOriginalFilename();
        // 获取上传的文件字节数组
        byte[] bytes = file.getBytes();
        // 保存到服务器
        Path path = Paths.get("uploads/" + fileName);
        Files.write(path, bytes);
        return Result.success();
    }
}
