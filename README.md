<div align="center">

<br/>

# 🏥 Help&Med

### Emergency contacts, medical articles & medicine info — all in one place

[![Kotlin](https://img.shields.io/badge/Kotlin-100%25-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack_Compose-UI-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)](https://developer.android.com/jetpack/compose)

<br/>

> **Help&Med** is a clean, minimal Android app that gives you instant access to emergency helpline numbers, in-depth medical articles on diseases, and detailed information on common medicines — right when you need them.

<br/>

---

</div>

## 📽️ Demo

<p align="center">
  <img src="C:\Users\Anuj\Videos\Screen Recordings\Screen Recording 2026-05-11 141755.mp4" width="260"/>
</p>Help Med

---

## ✨ Features

### 🚨 Emergency Contacts
- One-tap access to critical Indian emergency helplines
- Includes Police (100), Fire Brigade (101), Ambulance (102), Women Helpline (1091), Cyber Crime (1930), Child Helpline (1098), and more
- Search bar to quickly find the contact you need
- Tap the call button to dial instantly

### 📰 Medical Articles
- Browse articles on common diseases and conditions — Cardiovascular Disease, Diabetes, Epilepsy, Asthma, Cancer, and more
- Search by disease name or symptom
- Each article includes: Definition, Types, Causes, and Symptoms

### 💊 Medicines
- Searchable database of common medicines
- Filter by category: Painkiller, Fever, Inflammation, and more
- Each medicine detail page shows: Description, Uses, How to Use, Side Effects, and Precautions

---

## 🛠️ Tech Stack

Help&Med is built with the latest recommended Android technologies:

| Layer | Technology |
|---|---|
| **Language** | [Kotlin](https://kotlinlang.org/) |
| **UI** | [Jetpack Compose](https://developer.android.com/jetpack/compose) |
| **Dependency Injection** | [Dagger Hilt](https://dagger.dev/hilt/) |
| **Annotation Processing** | [KSP (Kotlin Symbol Processing)](https://github.com/google/ksp) |
| **Build System** | Gradle with Kotlin DSL (`.gradle.kts`) |

---

## 📁 Project Structure

```
HelpMed/
├── app/
│   └── src/
│       ├── main/
│       │   ├── java/           # Kotlin source files
│       │   └── res/            # Resources (layouts, drawables, etc.)
│       └── test/               # Unit tests
├── gradle/                     # Gradle wrapper & version catalog
├── build.gradle.kts            # Root build configuration
├── settings.gradle.kts         # Project settings
└── gradle.properties           # Gradle properties
```

---

## 🚀 Getting Started

### Prerequisites

- [Android Studio](https://developer.android.com/studio) (Hedgehog or newer recommended)
- JDK 17+
- Android SDK (API level 26+)

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/AnujChahal/HelpMed.git
   cd HelpMed
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Select **File → Open** and navigate to the cloned folder

3. **Sync & Build**
   - Let Gradle sync finish automatically
   - Click **Run ▶** or use `Shift + F10` to build and launch

4. **Run on a device or emulator**
   - Connect a physical Android device (USB debugging enabled), or
   - Create an emulator via **AVD Manager** (API 26+)

---

## 🤝 Contributing

Contributions are welcome and appreciated! Here's how to get started:

1. **Fork** the repository
2. **Create** a feature branch: `git checkout -b feature/your-feature-name`
3. **Commit** your changes: `git commit -m "feat: add your feature"`
4. **Push** to your branch: `git push origin feature/your-feature-name`
5. **Open a Pull Request** and describe your changes

Please make sure your code follows the existing Kotlin conventions and includes relevant tests where applicable.

---

## 🐛 Found a Bug?

If you encounter any issues, please [open an issue](https://github.com/AnujChahal/HelpMed/issues) with:
- A clear description of the problem
- Steps to reproduce
- Expected vs actual behavior
- Device/OS version info

---

<div align="center">

Made with ❤️ by [Anuj Chahal](https://github.com/AnujChahal)

⭐ If you find this project helpful, please consider giving it a star!

</div>
