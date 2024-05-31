# Logback을 활용해 로그 커스텀하기

## 요약

1. `springboot-starter`를 사용하면 `logback` 라이브러리가 기본으로 사용된다.
2. 로그에 대한 설정을 하고 싶다면 `application.yml` 혹은 로그 라이브러리 설정 파일을 직접 이용하면 된다. (logback의 경우 `logback.xml` 혹은 `logback-spring.xml`
3. Appender를 통해 로그를 관리할 수 있다. 위 예제 프로젝트에서는 `ConsoleAppender`와 `RollingFileAppender`를 이용했다.

자세한 내용은 블로그에 작성했습니다.
[[Log] Logback과 함께하는 슬기로운 로그 생활](https://dev-qhyun.tistory.com/24)
