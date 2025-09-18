pipeline {
    agent any
    stages {
        stage("Git Clone Repo....") {
            steps {
                script {
                    def gitClone = load "pipelines/gitclonerepo.groovy"
                    gitClone.run("https://github.com/Kowshikaraman/nodejs_project.git", "Kowshikaraman/nodejs_project")
                }
            }
        }
    }
}
