def validate(String CONTAINER_NAME){
    def exitStatus1 = bat(
        script: "docker ps -f name=${CONTAINER_NAME}",
        returnStdout: true
    ).trim()
    if(exitStatus1){
        bat "docker stop ${CONTAINER_NAME} || echo Container already stopped"
        bat "docker rm ${CONTAINER_NAME} || echo Container already Removed"
    }
    return true
}

return this