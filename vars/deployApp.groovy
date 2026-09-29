def call(String app, String target) {
  echo "deploying ${app} to ${target}"
  sh "ls -l ${app}.exe"
  echo "deploy to {target} finished"
}
