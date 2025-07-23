# CharactersApp

**CharactersApp** is a sample Android application designed to showcase modern Android development best practices as recommended by Google. It uses a clean architecture with the latest tools and libraries such as Kotlin, Jetpack Compose, Hilt, and Room for high maintainability, testability, and scalability.

---

## 🚀 Overview

- Built with **Kotlin** and **Jetpack Compose**
- Follows **Clean Architecture**: Data, Domain, and Presentation layers
- Implements **MVVM** with **Unidirectional Data Flow (UDF)**
- Uses **Hilt** for Dependency Injection
- Supports **Offline Data Access** using Room
- Modularized structure with reusable **core package**

---

## ✨ Features

- 🔄 Fetches data from API using **Retrofit**
- 🖼️ Displays a scrollable list using **LazyColumn**
- 📦 Supports **offline mode** with **Room** database
- 🔁 Handles configuration changes without reloading data
- ➖ Shows an **empty state** when no data is available
- 📱 Navigates to item **detail screen** using Compose Navigation
- 🧠 Shared **ViewModel** used for both dashboard and detail screens

---

## 🧰 Key Technologies

- **Kotlin**
- **Coroutines / Flow**
- **Jetpack Compose**
- **MVVM Architecture (UDF)**
- **Repository Pattern (Single source of truth)**
- **Hilt** (Dependency Injection)
- **Room** (Local DB for offline support)
- **Clean Code Architecture**

---

## ⚙️ Application Flow
**Fetches data from an endpoint:** The app uses Retrofit for network calls to fetch data from a remote server.
**Displays data in a list:** The data is displayed in a LazyColumn using Jetpack Compose.
**Supports offline mode:** Data is cached using Room and displayed when offline.
**Handles configuration changes:** The app retains the data and UI state during configuration changes (device rotation).
**Shows an empty state:** The app displays a placeholder when there is no data.
**Navigates to list item details:** When a list item is clicked, the app navigates to a details screen using Jetpack Compose Navigation.

Dashboard screen and detail screen has same retrofit response & same ViewModel has been used to manage the state.

---

## ✅ Best Practices Followed
- Separation of concerns using Clean Architecture
- Use of UDF (Unidirectional Data Flow) with ViewModel
- Repository Pattern to manage data sources
- Dependency Injection with Hilt
- Up-to-date dependencies with modularization
- Optimized for testability and scalability