def run(String APP_PORT,String DOCKER_PORT,String CONTAINER_NAME,String IMAGE){
    bat """docker run -d -p ${DOCKER_PORT}:${APP_PORT} --name ${CONTAINER_NAME} ${IMAGE}"""
}

return this