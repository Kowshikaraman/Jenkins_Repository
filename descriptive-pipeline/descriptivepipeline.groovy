pipeline{
    agent any
    stages{
        stage("This is a descriptive pipeline...."){
            steps{
                script{
                    echo "This is a descriptive pipeline to print"
                }
            }
        }
    }
}