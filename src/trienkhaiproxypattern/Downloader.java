package trienkhaiproxypattern;

public interface Downloader {
    void download(String url, String destPath) throws Exception;
}
