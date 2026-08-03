backend:
	cd apps/api && mvn spring-boot:run

build:
	cd apps/api && mvn clean package

docker-up:
	docker compose -f infrastructure/docker/docker-compose.yml up --build