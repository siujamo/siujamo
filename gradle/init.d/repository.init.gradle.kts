allprojects {
    repositories {
        mavenLocal()
        maven("https://repo.nju.edu.cn/maven/")
        maven("https://maven.proxy.ustclug.org/maven2/")
        maven("https://maven.aliyun.com/repository/public/")
        mavenCentral()
    }
}