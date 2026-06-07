package com.fakevideochat.domain.model;

/**
 * 本地用户在视频通话中的状态
 * Data Model for Local User State during Video Call
 */
public class LocalUserState {
    private boolean isMuted;              // 是否静音
    private boolean isSpeakerOn;          // 扬声器是否开启
    private CameraDirection cameraFacing; // 摄像头方向
    private boolean isFrontCamera;        // 是否使用前置摄像头
    private long localCallDurationMs;     // 本地通话时长

    public enum CameraDirection {
        FRONT,  // 前置摄像头
        BACK    // 后置摄像头
    }

    // 构造器
    public LocalUserState() {
        this.isMuted = false;
        this.isSpeakerOn = true;
        this.cameraFacing = CameraDirection.FRONT;
        this.isFrontCamera = true;
        this.localCallDurationMs = 0;
    }

    // Getters and Setters
    public boolean isMuted() {
        return isMuted;
    }

    public void setMuted(boolean muted) {
        isMuted = muted;
    }

    public boolean isSpeakerOn() {
        return isSpeakerOn;
    }

    public void setSpeakerOn(boolean speakerOn) {
        isSpeakerOn = speakerOn;
    }

    public CameraDirection getCameraFacing() {
        return cameraFacing;
    }

    public void setCameraFacing(CameraDirection cameraFacing) {
        this.cameraFacing = cameraFacing;
    }

    public boolean isFrontCamera() {
        return isFrontCamera;
    }

    public void setFrontCamera(boolean frontCamera) {
        isFrontCamera = frontCamera;
    }

    public long getLocalCallDurationMs() {
        return localCallDurationMs;
    }

    public void setLocalCallDurationMs(long localCallDurationMs) {
        this.localCallDurationMs = localCallDurationMs;
    }

    /**
     * 切换摄像头方向
     * Toggle camera between front and back
     */
    public void toggleCamera() {
        if (cameraFacing == CameraDirection.FRONT) {
            cameraFacing = CameraDirection.BACK;
            isFrontCamera = false;
        } else {
            cameraFacing = CameraDirection.FRONT;
            isFrontCamera = true;
        }
    }
}
