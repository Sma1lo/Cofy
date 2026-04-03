APP_NAME := cofy-app
COMPOSE := docker compose

.PHONY: build up down restart clean logs ps

build:
	./scripts/build.sh

up:
	./scripts/up.sh

down:
	./scripts/down.sh

restart: down up

clean:
	./scripts/clean.sh

logs:
	$(COMPOSE) logs -f

ps:
	$(COMPOSE) ps