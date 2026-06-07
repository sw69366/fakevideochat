# Fake Video Chat - Android App

**项目名称**：FakeVideoChat  
**中文名称**：假视频通话  
**版本**：v1.0（MVP）  
**平台**：Android 8.0+ (API 26)  
**主要语言**：Java  
**UI 框架**：Jetpack Compose  
**架构**：MVVM + Clean Architecture

## 项目简介

Fake Video Chat 是一款高仿真度的**模拟视频通话** Android 应用。

### 核心特性
- 提供接近真实视频通话的沉浸式体验
- 支持多种主流 App 皮肤（微信、WhatsApp、FaceTime 等）
- 支持定时自动来电
- 完全离线可用，注重性能和低内存占用

## 技术栈

- **语言**：Java
- **UI**：Jetpack Compose + Material 3
- **架构**：Clean Architecture
- **依赖注入**：Hilt
- **视频播放**：ExoPlayer (Media3)
- **相机**：CameraX
- **数据库**：Room
- **本地存储**：DataStore

## 项目结构

```
src/
├── main/
│   ├── java/com/fakevideochat/
│   │   ├── data/                 # Data Layer
│   │   ├── domain/               # Domain Layer
│   │   ├── presentation/         # Presentation Layer
│   │   └── di/                   # Dependency Injection
│   └── res/
└── test/
```
