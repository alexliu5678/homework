echo "start run clean ...."
call mvn clean
echo "executing package docker:build"
call mvn package docker:build
echo "run with docker"
call docker run -p 8088:8088 -t hwspring/demo