package org.hch.rpc.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by chenghao on 9/7/16.
 */

@ConfigurationProperties(prefix = "application.info")
public class ApplicationProperties {
    private String registerPath;
    private String appName;
    private String hostUrl;
    public String getHostUrl() {
        return hostUrl;
    }

    public void setHostUrl(String hostUrl) {
        this.hostUrl = hostUrl;
    }

    public String getAddr(){
        return hostUrl.split(":")[0];
    }
    public int getPort(){
        return Integer.parseInt(hostUrl.split(":")[1]);
    }


    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getRegisterPath() {
        return registerPath;
    }

    public void setRegisterPath(String registerPath) {
        this.registerPath = registerPath;
    }
    public String getFullPath(String appName){
        return new StringBuilder(registerPath).append("/").append(appName).toString();
    }
    public String getFullPath(){
        return getFullPath(appName);
    }
}
