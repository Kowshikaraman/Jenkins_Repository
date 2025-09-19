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
        stage("Create Container of ExpressJS App Image..."){
            steps{
                script{
                    def createContainer = load "pipelines/createcontainer.groovy"
                    switch(params.ENVIRONMENT){
                        case "dev":
                            echo "Creating container for Development Environment...."
                            createContainer.run("3200","3200","expressappcontainer","expressapp:1.0.1")
                        case "stage":
                            echo "Creating container for Stage Environment...."
                            createContainer.run("3300","3200","expressappcontainer","expressapp:1.0.1")    
                        case "prod":                        
                            echo "Creating container for Production Environment...."
                            createContainer.run("3400","3200","expressappcontainer","expressapp:1.0.1")
                    }
                }
            }
        }
    }
}
