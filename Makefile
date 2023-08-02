image: 
	mvn clean install -DskipTests
	docker build --platform linux/amd64 -t phone-country:local .

run: image
	docker-compose up --build

test:
	mvn clean install