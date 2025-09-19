def validate(String CONTAINER_NAME){
    def exitStatus1 = bat(script:'docker ps -aq -f "name=^%CONTAINER_NAME%$"',returnStatus:true)
    if(exitStatus1){
        bat "docker stop ${CONTAINER_NAME} || echo Container already stopped"
        bat "docker rm ${CONTAINER_NAME} || echo Container already Removed"
    }
    return true
}

return this