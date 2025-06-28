# Java Web App - Ứng dụng Web Java đơn giản

Đây là một ứng dụng web Java đơn giản được xây dựng bằng **Spring Boot** và **Thymeleaf**. Ứng dụng minh họa các tính năng cơ bản của một trang web với giao diện đẹp và responsive.

## 🚀 Tính năng

- **Trang chủ**: Hiển thị thông tin tổng quan và thời gian thực
- **Quản lý người dùng**: Xem danh sách và thêm người dùng mới
- **Trang giới thiệu**: Thông tin về ứng dụng và công nghệ sử dụng
- **Liên hệ**: Form gửi tin nhắn với validation
- **Responsive Design**: Tương thích với mọi thiết bị
- **UI đẹp**: Sử dụng Bootstrap 5 và FontAwesome

## 🛠️ Công nghệ sử dụng

- **Java 11+** - Ngôn ngữ lập trình chính
- **Spring Boot 2.7.14** - Framework phát triển ứng dụng
- **Thymeleaf** - Template engine
- **Bootstrap 5** - CSS Framework
- **FontAwesome** - Icon library
- **Maven** - Quản lý dependencies

## 📋 Yêu cầu hệ thống

- **Java 11** hoặc cao hơn
- **Maven 3.6+** (hoặc sử dụng Maven wrapper có sẵn)

## 🔧 Cách cài đặt và chạy

### Bước 1: Clone hoặc tải về dự án
```bash
# Nếu bạn có Git
git clone <repository-url>
cd java-app-test

# Hoặc tải về và giải nén file zip
```

### Bước 2: Kiểm tra Java version
```bash
java -version
# Đảm bảo Java 11 trở lên
```

### Bước 3: Chạy ứng dụng

#### Cách 1: Sử dụng Maven
```bash
# Chạy trực tiếp
mvn spring-boot:run

# Hoặc build và chạy
mvn clean package
java -jar target/java-web-app-1.0.0.jar
```

#### Cách 2: Sử dụng Maven Wrapper (không cần cài Maven)
```bash
# Trên Windows
./mvnw.cmd spring-boot:run

# Trên Linux/Mac
./mvnw spring-boot:run
```

### Bước 4: Truy cập ứng dụng
Mở trình duyệt và truy cập: **http://localhost:8080**

## 📱 Cấu trúc dự án

```
java-app-test/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       ├── Application.java          # Main class
│   │   │       ├── controller/
│   │   │       │   ├── HomeController.java   # Controller chính
│   │   │       │   └── UserController.java   # Controller người dùng
│   │   │       └── model/
│   │   │           └── User.java             # Model User
│   │   └── resources/
│   │       ├── templates/                    # Thymeleaf templates
│   │       │   ├── index.html               # Trang chủ
│   │       │   ├── about.html               # Trang giới thiệu
│   │       │   ├── users.html               # Quản lý người dùng
│   │       │   └── contact.html             # Trang liên hệ
│   │       └── application.properties        # Cấu hình ứng dụng
├── pom.xml                                   # Maven dependencies
└── README.md                                 # File này
```

## 🌐 Các trang web

1. **Trang chủ** (`/`) - Trang chính với thông tin tổng quan
2. **Giới thiệu** (`/about`) - Thông tin về ứng dụng
3. **Người dùng** (`/users`) - Quản lý danh sách người dùng
4. **Liên hệ** (`/contact`) - Form gửi tin nhắn

## ⚙️ Cấu hình

Ứng dụng sử dụng cấu hình mặc định:
- **Port**: 8080
- **Context Path**: /
- **Hot Reload**: Được bật (DevTools)

Để thay đổi cấu hình, chỉnh sửa file `src/main/resources/application.properties`

## 🔍 Troubleshooting

### Lỗi thường gặp:

1. **Port 8080 đã được sử dụng**
   ```bash
   # Thay đổi port trong application.properties
   server.port=8081
   ```

2. **Java version không tương thích**
   ```bash
   # Kiểm tra và cập nhật Java version
   java -version
   ```

3. **Maven không hoạt động**
   ```bash
   # Sử dụng Maven wrapper thay thế
   ./mvnw spring-boot:run    # Linux/Mac
   ./mvnw.cmd spring-boot:run # Windows
   ```

## 📝 Ghi chú

- Dữ liệu người dùng được lưu tạm thời trong bộ nhớ và sẽ reset khi khởi động lại ứng dụng
- Ứng dụng chỉ mang tính chất demo và học tập
- Để sử dụng trong production, cần thêm database và các tính năng bảo mật

## 🤝 Đóng góp

Nếu bạn muốn đóng góp hoặc báo lỗi, vui lòng tạo issue hoặc pull request.

## 📄 License

Dự án này được phát hành dưới MIT License.

---

**Chúc bạn code vui vẻ! 🎉** 