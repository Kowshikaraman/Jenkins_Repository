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
    }
}
