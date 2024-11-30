def call(){
  echo "It is deploying the code"
  sh "docker compose down && docker compose up -d"
}
