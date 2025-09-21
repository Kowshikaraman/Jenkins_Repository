pipeline {
    agent any
    triggers {
        cron('H/2 * * * *') 
    }
    stages {
        stage('Build & Test') {
            steps {
                echo "Running scheduled build"
            }
        }
    }
}
