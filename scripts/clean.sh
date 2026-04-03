#!/bin/bash
set -e

docker compose down -v --remove-orphans
docker system prune -f