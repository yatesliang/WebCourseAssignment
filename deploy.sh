sudo docker container rm -f web
sudo docker image rm -f web_test:latest
sudo docker build -t web_test:latest .
sudo docker run --name=web -d -p 9090:8080 web_test:latest
