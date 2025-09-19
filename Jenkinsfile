pipeline {
    agent any
    stages {
        stage("Git Clone Repo....") {
            steps {
                script {
                    def gitClone = load "pipelines/gitclonerepo.groovy"
                    // gitClone.run("https://github.com/Kowshikaraman/my_personal_project", "main", )
                    gitClone.run("https://github.com/Kowshikaraman/nodejs_project.git", "Kowshikaraman/nodejs_project","ExpressJSApp")

                }
            }
        }
        stage("Create Image of ExpressJS App..."){
            steps{
                script{
                    def createImage = load "pipelines/createimage.groovy"
                    createImage.build()
                }
            }
        }
        stage("Validate if container exists..."){
            steps{
                script{
                    def validateContainer = load "pipelines/validatecontainer.groovy"
                    validateContainer.validate("expressappcontainer")
                }
            }
        }
        stage("Create Container of ExpressJS App Image..."){
            steps{
                script{
                    def createContainer = load "pipelines/createcontainer.groovy"
                    def exitCode
                    switch(params.ENVIRONMENT){
                        case "dev":
                            echo "Creating container for Development Environment...."
                            exitCode = createContainer.run("3200","3200","expressappcontainer","expressapp:1.0.1")
                            break
                        case "stage":
                            echo "Creating container for Stage Environment...."
                            exitCode = createContainer.run("3300","3200","expressappcontainer","expressapp:1.0.1")
                            break    
                        case "prod":                        
                            echo "Creating container for Production Environment...."
                            exitCode = createContainer.run("3400","3200","expressappcontainer","expressapp:1.0.1")
                            break
                        default:
                            echo "Container cannot be created since there is no environment selected...."

                    }
                    echo "The exit code status is ${exitCode}"
                }
            }
        }
    }
}
