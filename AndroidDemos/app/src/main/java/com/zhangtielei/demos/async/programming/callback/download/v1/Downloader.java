package com.zhangtielei.demos.async.programming.callback.download.v1;

/**
 * Created by charleszhang on 4/17/16.
 * 下载器接口定义.
 */
public interface Downloader {
    /**
     * 设置回调监听器.
     * @param listener
     */
    void setListener(DownloadListener listener);
    /**
     * 启动资源的下载.
     * @param url 要下载的资源地址.
     * @param localPath 资源下载后要存储的本地位置.
     */
    void startDownload(String url, String localPath);
}
