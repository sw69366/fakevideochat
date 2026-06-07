package com.fakevideochat.domain.model;

/**
 * 代表远程视频通话中的对方用户信息
 * Data Model for Remote User in Video Call
 */
public class RemoteUser {
    private String userId;           // 用户唯一标识
    private String displayName;      // 显示名称
    private String avatarUrl;        // 头像URL
    private String videoUrl;         // 视频文件URL（本地或远程）
    private CallStatus callStatus;   // 通话状态
    private long callDurationMs;     // 通话时长（毫秒）
    private boolean isMuted;         // 是否静音
    private boolean isCameraOn;      // 摄像头是否开启
    private String skinType;         // 皮肤类型（微信、WhatsApp等）

    public enum CallStatus {
        RINGING,      // 来电中
        CONNECTED,    // 已连接
        ON_HOLD,      // 保持中
        DISCONNECTED  // 已断开
    }

    public RemoteUser() {}

    public RemoteUser(String userId, String displayName, String avatarUrl, String videoUrl) {
        this.userId = userId;
        this.displayName = displayName;
        this.avatarUrl = avatarUrl;
        this.videoUrl = videoUrl;
        this.callStatus = CallStatus.DISCONNECTED;
        this.callDurationMs = 0;
        this.isMuted = false;
        this.isCameraOn = true;
        this.skinType = "DEFAULT";
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public CallStatus getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(CallStatus callStatus) {
        this.callStatus = callStatus;
    }

    public long getCallDurationMs() {
        return callDurationMs;
    }

    public void setCallDurationMs(long callDurationMs) {
        this.callDurationMs = callDurationMs;
    }

    public boolean isMuted() {
        return isMuted;
    }

    public void setMuted(boolean muted) {
        isMuted = muted;
    }

    public boolean isCameraOn() {
        return isCameraOn;
    }

    public void setCameraOn(boolean cameraOn) {
        isCameraOn = cameraOn;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }
}
