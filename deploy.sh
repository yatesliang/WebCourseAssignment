docker container rm -f web
docker image rm -f web_test:latest
docker build -t web_test:latest .
docker run --name=web -d -p 9090:8080 web_test:latest
