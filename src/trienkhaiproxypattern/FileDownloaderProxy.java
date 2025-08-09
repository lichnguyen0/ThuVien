package trienkhaiproxypattern;

public class FileDownloaderProxy implements Downloader {
    private static final String FIREFOX_USER_AGENT =
            "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:109.0) Gecko/20100101 Firefox/109.0";

    private FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        // Khởi tạo FileDownloader với user agent Firefox
        this.fileDownloader = new FileDownloader(FIREFOX_USER_AGENT);
    }

    @Override
    public void download(String url, String destPath) throws Exception {
        fileDownloader.download(url, destPath);
    }
}

