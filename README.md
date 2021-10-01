# belegmaschine
Docker Image Starten:

docker run -p 127.0.0.1:3306:3306  --name belegmaschine -e MARIADB_ROOT_PASSWORD=belegmaschine -d mariadb:latest